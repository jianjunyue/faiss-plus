package faiss.vector;

import java.util.Random;

public class VectorData {
	public static float[][] dummyData() {
		return new float[][] { new float[] { 10, 0, 0 }, new float[] { 9, 0, 0 }, new float[] { 8, 0, 0 },
				new float[] { 7, 0, 0 }, new float[] { 6, 0, 0 },

				new float[] { 0, 10, 0 }, new float[] { 0, 9, 0 }, new float[] { 0, 8, 0 }, new float[] { 0, 7, 0 },
				new float[] { 0, 6, 0 },

				new float[] { 0, 0, 10 }, new float[] { 0, 0, 9 }, new float[] { 0, 0, 8 }, new float[] { 0, 0, 7 },
				new float[] { 0, 0, 6 }, };
	}
	
	public static float[][] dummyData3d(int size) {
        float[][] data = new float[size * 3][3];
        float half = size / 2.0f;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < size; j++) {
                float[] row = new float[]{0, 0, 0};
                row[i] = j - half;
                data[i * size + j] = row;
            }
        }
        return data;
    }
	
	public static float[][] randomData3d(int size) {
        float[][] data = new float[size * 3][3];
        float half = size / 2.0f;
        Random rand = new Random();
        for (int i = 0, j = data.length; i < j; i++) {
            float[] row = new float[]{rand.nextFloat() * size, rand.nextFloat() * size, rand.nextFloat() * size};
            data[i] = row;
        }
        return data;
    }
	
	public static String toString(float[][] vector) {
		StringBuilder sb=new StringBuilder();
		for(float[] fv : vector) {
			String temp="";
			for(float f: fv) {
				if(temp.length()>0) { 
					temp+=", "+f ;
				}else {
					temp+= " "+f ;
				} 
			}
			if(temp.length()>0) {
				sb.append(temp.substring(1)+"\n");
			}
		}
		return sb.toString();
	}
	
}
