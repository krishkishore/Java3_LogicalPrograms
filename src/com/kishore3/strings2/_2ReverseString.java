package com.kishore3.strings2;

// Using toCharArray()

// Input String : Hello World
// Output String : dlroW olleH

public class _2ReverseString {
	public static void main(String[] args) {

		String str = "Hello World";
		System.out.println("Input String : " + str);

		String outputString = "";

		char[] character = str.toCharArray();

		for (int i = character.length - 1; i >= 0; i--) {
			outputString += character[i];
		}

		System.out.print("Output String : " + outputString);

	}
}
