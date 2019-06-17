package com.kishore4.programs;

// X : 10 
// Y : 20

// X : 20 
// Y : 10

public class _2SwapNumbers {
	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		System.out.println("X : " + x + " \nY : " + y);

		System.out.println("------------------------------");

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("X : " + x + " \nY : " + y);

	}
}
