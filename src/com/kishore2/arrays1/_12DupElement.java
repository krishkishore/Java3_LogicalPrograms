package com.kishore2.arrays1;

import java.util.ArrayList;
import java.util.List;

public class _12DupElement {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();

		int[] a = { 2, 1, 2, 5, 5, 6, 6, 7, 2, 5 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] == a[j]) && (i != j)) {
					if (!al.contains(a[i])) {
						al.add(a[i]);
					}
				}
			}
		}
		System.out.println("Duplicate Elements:: " + al);

	}

}
