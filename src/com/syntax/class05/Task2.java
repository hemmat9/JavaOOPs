package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// Write a program that will print whether it is a weekend or weekday. If any
		// day from 1-5 → output “It is a weekday?, any day from 6-7 → output “It is a
		// weekend?, any other day → output “Invalid day

		Scanner days = new Scanner(System.in);
		System.out.println("Please enter number of weekday");
		int day = days.nextInt();
		if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
			System.out.println("it is a weekday");
		} else if (day == 6 || day == 7) {
			System.out.println("it is a weekend");
		} else {
			System.out.println("invalid day");
		}

	}
}