package com.syntax.class07.class07Homework;

public class HW1Class7 {

	public static void main(String[] args) {
		// Calculate sum of all even and all odd numbers from range 1 to 100

		int sum = 0;

		for (int a = 1; a <= 100; a++) {
			if (a % 2 == 0) {
				sum = sum + a;

			}

		}
		System.out.println("The sum of all even numbers from 1 to 100 is " + sum);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

		int sum1 = 0;
		for (int a = 1; a <= 100; a++) {
			if (a % 2 != 0) {
				sum1 = sum1 + a;
			}
		}
		System.out.println("The sum of all odd numbers from 1 to 100 is " + sum1);
	}
}