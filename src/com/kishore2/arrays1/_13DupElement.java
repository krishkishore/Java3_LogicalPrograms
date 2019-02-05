package com.kishore2.arrays1;

import java.util.HashSet;
import java.util.Set;

public class _13DupElement {

	public static void main(String[] args) {

		int[] a = { 10, 10, 20, 30, 40, 50, 10, 20, 30 };
		Set<Integer> set = new HashSet<>();

		for (int i : a) {
			if (!set.add(i)) {
				System.out.println("Duplicate Elements are :" + i);
			}
		}

	}
}
