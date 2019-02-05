package com.kishore2.arrays1;

import java.util.Arrays;

// Find Second largest element in an array of integers

public class _2SecondLargest {

	static int firstLargestNumber, secondLargestNumber;

	static void secondLargest(int[] inputArray) {

		if (inputArray[0] > inputArray[1]) {
			firstLargestNumber = inputArray[0];
			secondLargestNumber = inputArray[1];
		} else {
			firstLargestNumber = inputArray[1];
			secondLargestNumber = inputArray[0];
		}

		for (int i = 2; i < inputArray.length; i++) {
			if (inputArray[i] > firstLargestNumber) {
				secondLargestNumber = firstLargestNumber;
				firstLargestNumber = inputArray[i];
			} else if (inputArray[i] < firstLargestNumber && inputArray[i] > secondLargestNumber) {
				secondLargestNumber = inputArray[i];
			}
		}
		System.out.println("Input Array :" + Arrays.toString(inputArray));
		System.out.println("First Largest Number :" + firstLargestNumber);
		System.out.println("Second Largest Number :" + secondLargestNumber);
	}

	public static void main(String[] args) {
		secondLargest(new int[] { 47498, 14526, 74562, 42681, 75283, 45796 });
		secondLargest(new int[] { 200, 500, 100, 300, 400, 900, 700 });
	}

}
