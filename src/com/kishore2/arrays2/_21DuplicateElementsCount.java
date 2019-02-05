package com.kishore2.arrays2;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class _21DuplicateElementsCount {

	private static void DuplicateElement(int[] inputArray) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int array : inputArray) {
			if (hashMap.containsKey(array)) {
				hashMap.put(array, hashMap.get(array) + 1);
			} else {
				hashMap.put(array, 1);
			}
		}

		Set<Entry<Integer, Integer>> setValue = hashMap.entrySet();

		for (Entry<Integer, Integer> set : setValue) {
			if (set.getValue() > 1) {
				System.out.println("The Duplicate Element " + set.getKey() + " is repeated " + set.getValue() + " times");
			}
		}
	}

	public static void main(String[] args) {
		DuplicateElement(new int[] { 6, 4, 5, 6, 8, 7, 6, 4, 7, 6, 7 });
		DuplicateElement(new int[] { 1, 2, 7, 5, 3, 6 });
	}

}
