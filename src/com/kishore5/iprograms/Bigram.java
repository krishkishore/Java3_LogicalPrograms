package com.kishore5.iprograms;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Bigram {

	public static void bigram(String[] inputArray) {
		Map<String, Integer> mapData = new TreeMap<String, Integer>();
		String formatInput = "";

		for (String input : inputArray) {
			formatInput = formatInput + input;
		}
		formatInput = formatInput.toLowerCase();

		for (int i = 0; i < formatInput.length() - 1; i++) {
			for (int j = i + 1; j < i + 2; j++) {
				if (mapData.containsKey(formatInput.charAt(i) + "" + formatInput.charAt(j))) {
					mapData.put(formatInput.charAt(i) + "" + formatInput.charAt(j),
							mapData.get(formatInput.charAt(i) + "" + formatInput.charAt(j)) + 1);
				} else {
					mapData.put(formatInput.charAt(i) + "" + formatInput.charAt(j), 1);
				}

			}
		}
		System.out.println(mapData);

		String key = "";
		int value = 1;
		Set<Entry<String, Integer>> mp = mapData.entrySet();
		for (Entry<String, Integer> m : mp) {
			if (m.getValue() > value) {
				key = m.getKey();
				value = m.getValue();
			}
		}

		System.out.println("The Bigram is : ");
		System.out.println("Key : " + key + "\nvalue : " + value);

		System.out.println("The Maximum value holding Duplicate Keys are : ");
		Set<Entry<String, Integer>> map = mapData.entrySet();
		for (Entry<String, Integer> ma : map) {
			if (ma.getValue() == value) {
				System.out.println(ma.getKey());
			}
		}

	}

	public static void main(String[] args) {
		bigram(new String[] { "Kishore", "teeanankiareee", "anudeep", "hariharan" });
	}

}
