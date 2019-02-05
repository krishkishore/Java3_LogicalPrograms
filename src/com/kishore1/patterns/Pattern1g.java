package com.kishore1.patterns;

// 1
// 22
// 333
// 4444
// 55555

public class Pattern1g {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}
}
