import com.bj58.spider.faiss.Index;
import com.bj58.spider.faiss.IndexFlatL2;

import faiss.vector.VectorData;

public class Test {

	public static void main(String[] args) {

//		System.out.println(VectorData.toString(VectorData.dummyData()));
		System.out.println(VectorData.toString(VectorData.dummyData3d(2)));
		
		int d=32;
	     Index index = new IndexFlatL2(d);
//	     index.add(n, x);
	}

}
