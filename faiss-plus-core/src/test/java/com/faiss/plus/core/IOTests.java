package com.faiss.plus.core;
 

import java.nio.file.Paths;

public class IOTests {
	
    public static void main( String[] args )
    {
    	load();
        System.out.println( "Hello World!" );
    }
     
    public static void load() {
        System.load(Paths.get("./swigfaiss4j.so").toAbsolutePath().toString());
        System.loadLibrary("faiss");
    }

    private static float[][] dummyData() {
        return new float[][]{
            new float[]{10, 0, 0},
            new float[]{9, 0, 0},
            new float[]{8, 0, 0},
            new float[]{7, 0, 0},
            new float[]{6, 0, 0},

            new float[]{0, 10, 0},
            new float[]{0, 9, 0},
            new float[]{0, 8, 0},
            new float[]{0, 7, 0},
            new float[]{0, 6, 0},

            new float[]{0, 0, 10},
            new float[]{0, 0, 9},
            new float[]{0, 0, 8},
            new float[]{0, 0, 7},
            new float[]{0, 0, 6},
        };
    }
 
    public void testIndexWriteAndRead() {
        String filename = "./index-1";


    }
}
