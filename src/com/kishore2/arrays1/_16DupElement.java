package com.kishore2.arrays1;

import java.util.HashSet;
import java.util.Set;

public class _16DupElement {
	public static void main(String[] args) {
		int[] a = { 3, 5, 7, 9, 11, 3, 13 };
		int[] b = { 3, 5, 7, 3, 6 };

		Set<Integer> set = new HashSet<>();
		for (int aData : a) {
			set.add(aData);
		}
		System.out.println(set);
		
		for (int bData : b) {
			if (set.contains(bData)) {
				System.out.println(bData);
			}
		}

	}
}
