package faiss.vector;

import com.bj58.spider.ExamplesTest;
import com.bj58.spider.faiss.Index;
import com.bj58.spider.faiss.RangeSearchResult;
import com.bj58.spider.faiss.floatArray;
import com.bj58.spider.faiss.longArray;
import com.bj58.spider.faiss.longlongArray;
import com.bj58.spider.faiss4j.IndexHelper;

public class VectorSearch {

	public static void vectorSearch() {
		Index index = VectorIndex.vectorIndex();
		int resultSize = 4;
		float[][] queryConds = { new float[] { 0, 1, 8 } };
		floatArray query = IndexHelper.makeFloatArray(queryConds);

		RangeSearchResult re = new RangeSearchResult(resultSize);
		int querySize = queryConds.length;
		index.range_search(querySize, query.cast(), 0.3f, re);

		longlongArray labels = longlongArray.frompointer(re.getLabels());
		floatArray distances = floatArray.frompointer(re.getDistances());

//          log("Vectors:\n{}", IndexHelper.show(xb, numberOfVector, d));
		log("Query:\n{}", IndexHelper.show(query, querySize, queryConds[0].length));
		log("Distances:\n{}", IndexHelper.show(distances, querySize, resultSize));
		log("Labels:\n{}", IndexHelper.show(labels, querySize, resultSize));
	}

	private static void log(String value, String value1) {
		ExamplesTest.log(value, value1);
	}
}
