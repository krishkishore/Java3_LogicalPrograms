package com.kishore3.strings3;

public class _2PalindromeSub {

	private static int check(String str, int palindromeCount) {
		String emptySpace = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			emptySpace = emptySpace + str.charAt(i);
		}

		if (str.equals(emptySpace)) {
			System.out.println(str);
			palindromeCount++;
		}

		return palindromeCount;
	}

	private static void countSubPalindrome(String input) {
		System.out.println("Input : " + input);

		int subPalindromeCount = input.length();
		int n = 0;

		for (int i = 0; i < input.length(); i++) {
			n = i + 1;
			while (n < input.length()) {
				subPalindromeCount = check(input.substring(i, n + 1), subPalindromeCount);
				n = n + 1;
			}
		}

		// If you want for entire word
		// subPalindromeCount = check(input, subPalindromeCount);
		System.out.println("SubPalindromeCount : " + subPalindromeCount);
	}

	public static void main(String[] args) {
		countSubPalindrome(new String("abbcbba"));
	}

}
