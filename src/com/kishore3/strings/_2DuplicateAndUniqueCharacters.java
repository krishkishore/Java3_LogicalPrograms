package com.kishore3.strings;

import java.util.HashMap;
import java.util.Map;

public class _2DuplicateAndUniqueCharacters {
	public static void main(String[] args) {

		String str = "The Great India";
		System.out.println("Input : " + str);

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			if (map.get(str.toLowerCase().charAt(i)) != null) {
				int counter = map.get(str.toLowerCase().charAt(i));
				map.put(str.toLowerCase().charAt(i), ++counter);
			} else {
				map.put(str.toLowerCase().charAt(i), 1);
			}
		}

		System.out.println("Output : " + map);

		System.out.println("Duplicate Characters and its Length with Space");
		for (Character c : map.keySet()) {
			if (map.get(c) > 1) {
				System.out.println(c + " : " + map.get(c));
			}
		}

		System.out.println("Duplicate Characters and its Length without Space");
		for (Character c : map.keySet()) {
			if (map.get(c) > 1 && c != ' ') {
				System.out.println(c + " : " + map.get(c));
			}
		}

		System.out.println("Unique Characters and its Length");
		for (Character c : map.keySet()) {
			if (map.get(c) == 1) {
				System.out.println(c + " : " + map.get(c));
			}
		}

	}
}
