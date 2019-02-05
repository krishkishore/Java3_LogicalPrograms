package com.kishore1.patterns;

// 1
// 12
// 123
// 1234
// 12345
// 1234
// 123
// 12
// 1 

public class Pattern1l {

	public static void main(String[] args) {

		int n = 7;

		for (int i = 1; i <= 2 * n - 1; i++) {
			for (int j = 1; j <= i && i <= n; j++) {
				System.out.print(j);
			}
			for (int k = 1; k <= 2 * n - i && i > n; k++) {
				System.out.print(k);
			}
			System.out.println();
		}

	}
}
