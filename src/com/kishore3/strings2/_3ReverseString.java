package com.kishore3.strings2;

// Input String : Hello World Guys
// OutputString : olleH dlroW syuG 

public class _3ReverseString {
	public static void main(String[] args) {

		String str = "Hello World Guys";
		System.out.println("Input String : " + str);

		String outputString = "";

		String[] splitString = str.split(" ");

		for (int i = 0; i < splitString.length; i++) {
			for (int j = splitString[i].length() - 1; j >= 0; j--) {
				outputString += splitString[i].charAt(j);
			}
			outputString += " ";
		}

		System.out.println("OutputString : " + outputString);

	}
}
