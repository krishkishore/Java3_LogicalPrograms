package com.kishore2.arrays1;

import java.util.Arrays;
import java.util.HashSet;

// Intersection of Two Arrays

public class _6IntersectionOfTwoArrays {

	private static void intersectionOfArrays(String[] firstArray, String[] secondArray) {
		HashSet<String> set = new HashSet<>();
		System.out.println("First Array : " + Arrays.toString(firstArray));
		System.out.println("Second Array : " + Arrays.toString(secondArray));

		for (String firstArr : firstArray) {
			for (String secondArr : secondArray) {
				if (firstArr.equalsIgnoreCase(secondArr)) {
					set.add(firstArr);
				}
			}
		}

		System.out.println("The Intersection of Two Arrays are : " + set);
	}

	// Using retainAll Method
	private static void usingRetailAll(String[] firstArray, String[] secondArray) {
		HashSet<String> set1 = new HashSet<>(Arrays.asList(firstArray));
		HashSet<String> set2 = new HashSet<>(Arrays.asList(secondArray));
		if (set1.retainAll(set2)) {
			System.out.println("Using retainAll Function : " + set1);
		}
	}

	public static void main(String[] args) {
		intersectionOfArrays(new String[] { "one", "TWO", "THREE", "FOUR", "FIVE", "FOUR" },
				new String[] { "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR", "ONE" });

		usingRetailAll(new String[] { "one", "TWO", "THREE", "FOUR", "FIVE", "FOUR" },
				new String[] { "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR", "ONE" });
	}

}
