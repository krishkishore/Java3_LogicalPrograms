package com.kishore3.strings1;

// Input = " He llo Fol ks ";
// Output = "HelloFolks";

public class _1RemoveWhiteSpace {
	public static void main(String[] args) {

		String input = " He llo Fol ks ";
		System.out.println("Input String : " + input);

		String whiteSpace = "";

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ' ') {
				whiteSpace = whiteSpace + input.charAt(i);
			}
		}

		System.out.println("Output String : " + whiteSpace);
	}
}
