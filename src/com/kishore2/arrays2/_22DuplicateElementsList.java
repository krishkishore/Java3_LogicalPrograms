package com.kishore2.arrays2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

// Remove duplicate elements from an array
public class _22DuplicateElementsList {

	private static void removeDuplicates(int[] inputArray) {
		ArrayList<Integer> al1 = new ArrayList<>();

		HashSet<Integer> hashSet = new HashSet<>();
		for (int i : inputArray) {
			if (!hashSet.add(i)) {
				if (!al1.contains(i)) {
					al1.add(i);
				}
			}
		}
		System.out.println("Array Without Duplicates : " + Arrays.toString(inputArray));
		System.out.println("The Duplicate elements in the array is " + al1);
		System.out.println("==============================");

	}

	public static void main(String[] args) {
		removeDuplicates(new int[] { 4, 3, 2, 4, 9, 2 });
		removeDuplicates(new int[] { 1, 2, 1, 2, 1, 2 });
		removeDuplicates(new int[] { 15, 21, 11, 21, 51, 21, 11 });
		removeDuplicates(new int[] { 7, 3, 21, 7, 34, 18, 3, 21, 3 });
	}

}
