package com.kishore2.arrays1;

public class _15DupElement {
	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 50, 60 };
		int[] b = { 10, 20, 50, 70 };

		System.out.println("Duplicate Elements in the array are:");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}
}
