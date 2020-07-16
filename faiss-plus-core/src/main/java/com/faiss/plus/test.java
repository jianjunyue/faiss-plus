package com.faiss.plus;

import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		int[] ints = { 50, 1, 4, 8, 3 };
		String[] strings = { "q", "a", "c" } ;
		Arrays.sort(ints);
		for (int i = 0; i < ints.length; i++) {
		    System.out.print(ints[i]+" ");
		}
	}
}
