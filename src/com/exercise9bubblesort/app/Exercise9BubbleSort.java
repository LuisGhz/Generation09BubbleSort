package com.exercise9bubblesort.app;

import java.util.Random;
import java.util.Arrays;

public class Exercise9BubbleSort {
	public static void main(String[] arguments) {
		//Constants declaration
		final int ELEMENTS_ARRAYS = 20;
		
		//Variables declaration
		byte temp = 0;
		
		//Objects declaration
		Random randomNumbers = new Random(System.nanoTime());
		
		//Arrays declaration
		byte[] myArr = new byte[ELEMENTS_ARRAYS];
		
		//Genereting array with random numbers
		for (int i = 0; i < ELEMENTS_ARRAYS; i++) {
			myArr[i] = (byte) (randomNumbers.nextInt(50) + 51);
		}
		
		System.out.println("Before sort");
		System.out.println(Arrays.toString(myArr));
		
		//Sorting array
		for (int i = 0; i < ELEMENTS_ARRAYS; i++) {
			for (int x = 1; x < (ELEMENTS_ARRAYS - i); x++ ) {
				if (myArr[x - 1] > myArr[x]) {
					temp = myArr[x - 1];
					myArr[x - 1] = myArr[x];
					myArr[x] = temp;
				}
			}
		}
		
		System.out.println("After Sort");
		System.out.println(Arrays.toString(myArr));
	}
}
