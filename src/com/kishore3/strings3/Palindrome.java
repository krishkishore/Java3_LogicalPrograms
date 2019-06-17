package com.kishore3.strings3;

// Palindrome or Not

public class Palindrome {
	public static void main(String[] args) {

		String inputString = "WOW";
		System.out.println("Input String : " + inputString);

		String outputString = "";

		for (int i = inputString.length() - 1; i >= 0; i--) {
			outputString += inputString.charAt(i);
		}
		System.out.println("OutputString : " + outputString);

		if (inputString.equals(outputString)) {
			System.out.println("The String is Palindrome");
		} else {
			System.out.println("The String is Not Palindrome");
		}

	}
}
