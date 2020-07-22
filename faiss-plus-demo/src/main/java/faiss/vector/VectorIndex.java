package faiss.vector;

import com.bj58.spider.ExamplesTest;
import com.bj58.spider.faiss.Index;
import com.bj58.spider.faiss.IndexFlatL2;
import com.bj58.spider.faiss.floatArray;
import com.bj58.spider.faiss4j.IndexHelper;

public class VectorIndex {
	
	public static Index vectorIndex() {
        float[][] data = VectorData.dummyData3d(20);
        int d = data[0].length;
        int numberOfVector = data.length;
        floatArray xb = IndexHelper.makeFloatArray(data);
        Index index = new IndexFlatL2(d);
        index.add(numberOfVector, xb.cast());
        
        log("Vectors:\n{}", IndexHelper.show(xb, numberOfVector, d));
        
        return index;
	}
	
	
	
	private static void log(String value,String value1) {
		ExamplesTest.log(value,value1);
	}
}
