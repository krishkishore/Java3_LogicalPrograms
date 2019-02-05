package com.kishore2.arrays1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _14DupElement {
	public static void main(String[] args) {

		int[] a = { 10, 90, 20, 30, 40, 50, 10, 20, 30, 40 };
		Set<Integer> set = new HashSet<>();
		List<Integer> al = new ArrayList<>();

		for (int i : a) {
			if (!set.add(i)) {
				if (!al.contains(i)) {
					al.add(i);
					System.out.println("Duplicate Elements are: " + i);
				}

			}
		}

	}
}
