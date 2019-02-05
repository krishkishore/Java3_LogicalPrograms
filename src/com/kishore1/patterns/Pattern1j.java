package com.kishore1.patterns;

// 12345
//  1234
//   123
//    12
//     1

public class Pattern1j {

	public static void main(String[] args) {

		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}

	}
}
