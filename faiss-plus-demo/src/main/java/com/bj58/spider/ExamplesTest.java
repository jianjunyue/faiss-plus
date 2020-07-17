package com.bj58.spider;

import com.bj58.spider.faiss.*;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Random;

import static com.bj58.spider.faiss4j.IndexHelper.*;

//java -cp faiss-plus-demo-7.jar com.bj58.spider.ExamplesTest start

public class ExamplesTest {
//	private static Logger log = LoggerFactory.getLogger(ExamplesTest.class);

	public static void main(String argv[]) {
		log("search 5 first vector of xb");
		log("search 5 first vector of xb");
		testFlat();
		egIndexIVFFlat();
		log("test");
	}

	public static void log(String key) {
		log(key, "null");
	}

	public static void log(String key, Object value) {
		try {
			String content = key;
			File file = new File("log.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			BufferedWriter output = new BufferedWriter(new FileWriter(file, true));

			output.write(content);
			output.write(value.toString());
			output.write("\r\n");// 换行

			output.flush();
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static {
		try {
			log("static ");
			String property = System.getProperty("java.library.path");
//		System.out.println(property);
//        System.loadLibrary("faiss");
//        System.loadLibrary("libswigfaiss4j.so");
//        System.out.println("load libswigfaiss4j success");
			String path = Paths.get("./libswigfaiss4j.so").toAbsolutePath().toString();
			path = "/root/data/faiss4java/libswigfaiss4j.so";
			System.load(path);

			log("staticstatic ");
//        System.loadLibrary("faiss");
		} catch (Exception e) {
			log("staticstaticstatic");
		}
	}

	public static void testFlat() {
		int d = 5; // dimension
		int nb = 10; // database size
		int nq = 10000; // nb of queries

//        float[] xb = new float[d * nb];
//        float[] xq = new float[d * nq];
		try {
			floatArray xb = new floatArray(d * nb);

			Random rand = new Random();

			for (int i = 0; i < nb; i++) {
				for (int j = 0; j < d; j++) {
//                xb[d * i + j] = rand.nextFloat();
					xb.setitem(d * i + j, rand.nextFloat());
				}
//            xb[d * i] += i / 1000.;
				xb.setitem(d * i, (float) (i / 1000.0));
			}

			IndexFlatL2 index = new IndexFlatL2(d);
			log("is_trained = {}", index.getIs_trained());
			index.add(nb, xb.cast());
			log("ntotal = {}", index.getNtotal());

			{
				int k = 4;
				longlongArray I = new longlongArray(k * 5);
				floatArray D = new floatArray(k * 5);

				log("search 5 first vector of xb");
				index.search(5, xb.cast(), 4, D.cast(), I.cast());
				log("Vectors:\n{}", show(xb, nb, d));
				log("Distances:\n{}", show(D, 5, 4));
				log("I:\n{}", show(I, 5, 4));
			}
		} catch (Exception e) {
			log("failed", e);
		}
	}

	public void simpleTest() {
		try {
			float[][] data = dummyData3d(10);
			int d = data[0].length;
			int numberOfVector = data.length;
			floatArray xb = makeFloatArray(data);
			longArray ids = makeLongArray(new int[] { 0, 1, 2 });
			IndexFlatL2 index = new IndexFlatL2(d);
			// what(): Error in virtual void faiss::Index::add_with_ids(faiss::Index::idx_t,
			// const float*, const long int*) at Index.cpp:46: add_with_ids not implemented
			// for this type of index

//            index.add_with_ids(3, xb.cast(), ids.cast());
			index.add(numberOfVector, xb.cast());

			log("ntotal = {}", index.getNtotal());

			{
				int resultSize = 3;
				float[][] queryConds = { new float[] { 0, 1, 8 } };

				floatArray query = makeFloatArray(queryConds);
				longlongArray labels = new longlongArray(resultSize);
				floatArray distances = new floatArray(resultSize);
				index.search(1, query.cast(), resultSize, distances.cast(), labels.cast());

				log("Vectors:\n{}", show(xb, numberOfVector, d));
				log("Query:\n{}", show(query, queryConds.length, queryConds[0].length));
				log("Distances:\n{}", show(distances, 1, resultSize));
				log("Labels:\n{}", show(labels, 1, resultSize));
			}
		} catch (Exception e) {
//			log.error("failed", e);
		}
	}

	public void testSearchRange() {
		float[][] data = dummyData3d(20);
		int d = data[0].length;
		int numberOfVector = data.length;

		try {
			floatArray xb = makeFloatArray(data);
			IndexFlatL2 index = new IndexFlatL2(d);
			index.add(numberOfVector, xb.cast());

			{
				int resultSize = 4;
				float[][] queryConds = { new float[] { 0, 1, 8 } };
				floatArray query = makeFloatArray(queryConds);

				RangeSearchResult re = new RangeSearchResult(resultSize);
				int querySize = queryConds.length;
				index.range_search(querySize, query.cast(), 0.3f, re);

				longlongArray labels = longlongArray.frompointer(re.getLabels());
				floatArray distances = floatArray.frompointer(re.getDistances());

//				log.info("Vectors:\n{}", show(xb, numberOfVector, d));
//				log.info("Query:\n{}", show(query, querySize, queryConds[0].length));
//				log.info("Distances:\n{}", show(distances, querySize, resultSize));
//				log.info("Labels:\n{}", show(labels, querySize, resultSize));
			}

		} catch (Exception e) {
//			log.error("failed", e);
		}
	}

	public static void egIndexIVFFlat() {
		try {
			float[][] data = randomData3d(200);
			int dimension = data[0].length;
			int numberOfVector = data.length;
			int nlist = 6;
			int nprobe = 2;

			IndexFlatL2 quantizer = new IndexFlatL2(dimension);
			IndexIVFFlat index = new IndexIVFFlat(quantizer, dimension, nlist, MetricType.METRIC_L2);

			float[][] trainData = dummyData3d(5);
			floatArray tb = makeFloatArray(trainData);
			log("Vectors:\n{}", show(tb, trainData.length, dimension));
			index.train(trainData.length, tb.cast());

			floatArray xb = makeFloatArray(data);
			index.add(numberOfVector, xb.cast());

			int resultSize = 10;
			float[][] queryConds = { new float[] { 0, 0, 8 } };

			floatArray query = makeFloatArray(queryConds);
			longlongArray labels = new longlongArray(resultSize);
			floatArray distances = new floatArray(resultSize);

			int numberOfQuery = queryConds.length;
			index.setNprobe(nprobe);
			index.search(numberOfQuery, query.cast(), resultSize, distances.cast(), labels.cast());

			log("Vectors:\n{}", show(xb, numberOfVector, dimension));
			log("Query:\n{}", show(query, queryConds.length, queryConds[0].length));
			log("Distances:\n{}", show(distances, 1, resultSize));
			log("Labels:\n{}", show(labels, 1, resultSize));
		} catch (Exception e) {
			log("failed", e);
		}
	}

	private static float[][] dummyData3d(int size) {
		float[][] data = new float[size * 3][3];
		float half = size / 2.0f;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < size; j++) {
				float[] row = new float[] { 0, 0, 0 };
				row[i] = j - half;
				data[i * size + j] = row;
			}
		}
		return data;
	}

	private static float[][] randomData3d(int size) {
		float[][] data = new float[size * 3][3];
		float half = size / 2.0f;
		Random rand = new Random();
		for (int i = 0, j = data.length; i < j; i++) {
			float[] row = new float[] { rand.nextFloat() * size, rand.nextFloat() * size, rand.nextFloat() * size };
			data[i] = row;
		}
		return data;
	}

}