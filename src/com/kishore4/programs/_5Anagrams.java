package com.kishore4.programs;

import java.util.Arrays;

public class _5Anagrams {
	public static void main(String[] args) {
		String str1 = "Eleven plus two1";
		String str2 = "Twelve plus one 1";

		str1 = str1.replace(" ", "");
		str2 = str2.replace(" ", "");

		if (str1.length() == str2.length()) {
			char[] char1 = str1.toLowerCase().toCharArray();
			char[] char2 = str2.toLowerCase().toCharArray();

			Arrays.sort(char1);
			Arrays.sort(char2);

			System.out.println(char1);
			System.out.println(char2);

			boolean status = Arrays.equals(char1, char2);

			if (status) {
				System.out.println("The two strings are Anagrams");
			} else {
				System.out.println("The two strings are Not Anagrams");
			}
		}

	}
}
