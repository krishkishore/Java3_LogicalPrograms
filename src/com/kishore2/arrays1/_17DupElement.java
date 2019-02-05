package com.kishore2.arrays1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _17DupElement {
	public static void main(String[] args) {
		int[] a = { 3, 5, 7, 9, 11, 3, 13 };
		int[] b = { 3, 5, 7, 3, 6 };

		Set<Integer> set = new HashSet<>();

		for (int aData : a) {
			set.add(aData);
		}
		System.out.println(set);

		List<Integer> al = new ArrayList<>();

		for (int bData : b) {
			if (set.contains(bData)) {
				if (!al.contains(bData)) {
					al.add(bData);
					System.out.println(bData);
				}
			}
		}

	}

}
