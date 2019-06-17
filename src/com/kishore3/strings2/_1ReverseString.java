package com.kishore3.strings2;

// Using charAt()

// Input String : Hello World
// outputString : dlroW olleH

public class _1ReverseString {
	public static void main(String[] args) {

		String str = "Hello World";
		System.out.println("Input String : " + str);

		String outputString = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			outputString += str.charAt(i);
		}

		System.out.println("outputString : " + outputString);
	}
}
