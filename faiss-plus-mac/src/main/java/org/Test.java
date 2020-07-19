package org;

import static org.faiss.plus.mac.faiss4j.IndexHelper.getLineFromFloatArray;

import java.util.Arrays;

import org.faiss.plus.mac.ExamplesTest;
import org.faiss.plus.mac.faiss4j.FaissIndex;

import com.bj58.spider.faiss.Index;
import com.bj58.spider.faiss.IndexFlatL2;
import com.bj58.spider.faiss.IndexIVFFlat;
import com.bj58.spider.faiss.MetricType;

public class Test {

	public static void main(String[] args) {
		ExamplesTest.init();
	}
	
	
	private static void test() {
		int d=10;//向量长度
	    long ncentroids = 4096;
		Index quantizer = new IndexFlatL2(d);
		Index index = new IndexIVFFlat(quantizer, d, ncentroids, MetricType.METRIC_L2);
	 

        // remember a few elements from the database as queries
        int i0 = 1234;
        int i1 = 1245;

//        float[][] query = Arrays.copyOfRange(index.tmp_vec, i0, i1); 
	}
	

}
