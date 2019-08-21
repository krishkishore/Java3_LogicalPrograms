package com.kishore4.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _3Fibonacci {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Fibonacci Index");
		int input = scan.nextInt();

		List<Integer> fiboncciList = new ArrayList<>();
		int firstIndex = 0;
		int secondIndex = 1;
		fiboncciList.add(firstIndex);
		fiboncciList.add(secondIndex);

		for (int i = 2; i <= input; i++) {
			int next = firstIndex + secondIndex;
			fiboncciList.add(next);
			firstIndex = secondIndex;
			secondIndex = next;
		}
		System.out.println(fiboncciList);
		System.out.println(fiboncciList.get(input));
	}
}
