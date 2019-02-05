package com.kishore1.patterns;

public class Pattern6a {

	public static void main(String[] args) {

		for (int i = 9; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			for (int k = 9; k > i; k--) {
				System.out.print(" " + " ");
			}
			for (int l = i; l >= 1; l--) {
				System.out.print(i);
			}
			System.out.println();
		}

	}
}
