package com.kishore2.arrays2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class _23FrequentElementInArray {

	private static void getMostFrequentElement(int[] inputArray) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();

		for (int array : inputArray) {
			if (hashMap.containsKey(array)) {
				hashMap.put(array, hashMap.get(array) + 1);
			} else {
				hashMap.put(array, 1);
			}
		}
		System.out.println(hashMap);

		int element = 0, frequency = 1;

		Set<Entry<Integer, Integer>> hashSet = hashMap.entrySet();

		for (Entry<Integer, Integer> hm : hashSet) {
			if (hm.getValue() > frequency) {
				element = hm.getKey();
				frequency = hm.getValue();
			}
		}

		if (frequency > 1) {
			System.out.println("Input Array : " + Arrays.toString(inputArray));
			System.out.println("The most frequent element : " + element);
			System.out.println("Its frequency : " + frequency);
			System.out.println("========================");
		} else {
			System.out.println("Input Array : " + Arrays.toString(inputArray));
			System.out.println("No frequent element. All elements are unique.");
			System.out.println("=========================");
		}

	}

	public static void main(String[] args) {
		getMostFrequentElement(new int[] { 6, 4, 5, 6, 8, 7, 6, 4, 7, 6, 7 });
		getMostFrequentElement(new int[] { 1, 2, 7, 5, 3, 6 });
	}

}
