package com.kishore2.arrays1;

import java.util.ArrayList;

public class _11DupElement {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		int[] a = { 2, 1, 2, 5, 5, 6, 6, 7, 2, 5 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] == a[j]) && (i != j)) {
					al.add(a[i]);
				}
			}
		}
		System.out.println(al);
		
	}
}
