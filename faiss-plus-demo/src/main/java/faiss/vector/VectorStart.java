package faiss.vector;

import com.bj58.spider.ExamplesTest;

public class VectorStart {

	public static void main(String[] args) {
		try {
			ExamplesTest.init();
			VectorSearch.vectorSearch();
		} catch (Exception e) {
			ExamplesTest.log("failed", e.getMessage());
		}
	}
}
