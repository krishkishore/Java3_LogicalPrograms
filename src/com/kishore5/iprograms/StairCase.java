package com.kishore5.iprograms;

import java.util.ArrayList;

public class StairCase {
	static ArrayList<Integer> list = new ArrayList<>();

	private static void shortestStairCase(int[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.println(i);
			System.out.println(input[i]);
			System.out.println(input[i + 1]);

			if (!((input[i] + input[i + 1]) < input[i]) && i == 0) {
				System.out.println("a");
				list.add(input[i + 1]);
				i++;
			} else if (input[i] > input[i + 1]) {
				System.out.println("b");
				list.add(input[i + 1]);
				i++;
			} else if ((input[i] + input[i + 1]) > input[i + 1] && input[i + 1] > input[i + 2]) {
				System.out.println("c");
				list.add(input[i]);
			} else if ((input[i] + input[i + 1]) < input[i]) {
				System.out.println("d");
				list.add(input[i]);
			}
			System.out.println("List" + list + "\n");
		}
		System.out.println("List : " + list);
	}

	public static void main(String[] args) {
		shortestStairCase(new int[] { 500, 200, 50, 150, 50, 500, 200 });
	}

}
