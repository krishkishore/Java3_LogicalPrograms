package com.kishore2.arrays1;

import java.util.Arrays;

// Check the equality of two arrays

public class _3EqualityOfTwoArrays {

	private static void equality(int[] firstArray, int[] secondArray) {
		boolean isEqual = true;

		if (firstArray.length == secondArray.length) {
			for (int i = 0; i < firstArray.length && isEqual; i++) {
				if (firstArray[i] != secondArray[i]) {
					isEqual = false;
				}
			}
		}

		System.out.println("FirstArray :" + Arrays.toString(firstArray));
		System.out.println("SecondArray :" + Arrays.toString(secondArray));
		if (isEqual) {
			System.out.println("Two Arrays are Equal");
		} else {
			System.out.println("Arrays are not Eqaul");
		}

	}

	private static void predefinedEqualsMethod(int[] firstArray, int[] secondArray) {
		if (Arrays.equals(firstArray, secondArray)) {
			System.out.println("Two Arrays are Equal");
		} else {
			System.out.println("Arrays are not Eqaul");
		}
	}

	public static void main(String[] args) {
		equality(new int[] { 21, 57, 11, 37, 24 }, new int[] { 21, 57, 11, 37, 24 });
		equality(new int[] { 21, 57, 11, 37, 24 }, new int[] { 21, 57, 11, 37, 23 });
		predefinedEqualsMethod(new int[] { 21, 57, 11, 37, 24 }, new int[] { 21, 57, 11, 37, 24 });
	}

}
