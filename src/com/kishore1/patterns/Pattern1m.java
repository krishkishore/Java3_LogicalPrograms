package com.kishore1.patterns;

// 12345	
// 1234	
// 123
// 12
// 1
// 12
// 123
// 1234
// 12345

public class Pattern1m {
	public static void main(String[] args) {

		int n = 5;

		for (int i = 2 * n - 1; i >= 1; i--) {
			for (int j = 1; j <= i - n + 1; j++) {
				System.out.print(j);
			}
			for (int k = 1; i < n && k <= n - i + 1; k++) {
				System.out.print(k);
			}
			System.out.println();
		}

	}
}
