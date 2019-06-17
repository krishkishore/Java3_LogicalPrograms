package com.kishore4.programs;

// X : 10 
// Y : 20

// X : 20 
// Y : 10

public class _1SwapNumbers {
	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		System.out.println("X : " + x + " \nY : " + y);

		System.out.println("------------------------------");

		int temp = x;
		x = y;
		y = temp;

		System.out.println("X : " + x + " \nY : " + y);

	}
}
