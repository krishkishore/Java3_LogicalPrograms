package com.kishore2.arrays2;

import java.util.Arrays;

public class _12SeparateZerosfromInteger {

	private static void separateZeros(int[] inputArray) {
		int counter = inputArray.length - 1;

		for (int i = inputArray.length - 1; i >= 0; i--) {
			if (inputArray[i] != 0) {
				inputArray[counter] = inputArray[i];
				counter--;
			}
		}
		while (counter >= 0) {
			inputArray[counter] = 0;
			counter--;
		}
		System.out.println(Arrays.toString(inputArray));

	}

	public static void main(String[] args) {
		separateZeros(new int[] { 90, 20, 0, 60, 0, 50, 1, 10, 0 });
	}

}
