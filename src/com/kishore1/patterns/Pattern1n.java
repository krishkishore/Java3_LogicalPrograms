package com.kishore1.patterns;

//      1
//     2 2
//    3 3 3
//   4 4 4 4
//  5 5 5 5 5

public class Pattern1n {

	public static void main(String[] args) {

		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				if (k % 2 == 0) {
					System.out.print(" ");
				} else {
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}
}
