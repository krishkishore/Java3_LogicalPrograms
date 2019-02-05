package com.kishore2.arrays2;

import java.util.Arrays;

public class _11SeparateZerosfromInteger {

	private static void separateZeros(int[] inputArray) {

		int counter = 0;

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] != 0) {
				inputArray[counter] = inputArray[i];
				counter++;
			}
		}
		while (counter < inputArray.length) {
			inputArray[counter] = 0;
			counter++;
		}

		System.out.println(counter);
		System.out.println(Arrays.toString(inputArray));
	}

	public static void main(String[] args) {
		separateZeros(new int[] { 0, 10, 20, 0, 60, 0, 50, 1, 0 });
	}

}
