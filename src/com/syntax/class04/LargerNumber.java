package com.syntax.class04;

import java.util.Scanner;

public class LargerNumber {

	public static void main(String[] args) {
		// Create a Java program to capture 2 numbers from a user and define which
		// number is the largest.

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter first number.");

		int num2 = scanner.nextInt();

		System.out.println("Please enter second number.");

		int num3 = scanner.nextInt();

		if (num2 > num3) {
			System.out.println(num2 + " is larger than " + num3);
		} else
			System.out.println(num3 + " is larger than " + num2);
	}

}
