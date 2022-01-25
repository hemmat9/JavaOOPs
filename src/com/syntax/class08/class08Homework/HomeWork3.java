package com.syntax.class08.class08Homework;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads a range of integers (start and end point),
		 * provided by a user and then from that range prints the sum of the even and
		 * odd integers.
		 */
		System.out.println("Enter a range of numbers:");
		Scanner scanner = new Scanner(System.in);
		int BeginningNumber = scanner.nextInt();
		int EndNumber = scanner.nextInt();
		int EvenSum = 0;
		int OddSum = 0;
		for (int i = BeginningNumber; i <= EndNumber; i++) {
			if (i % 2 == 0) {
				EvenSum += i;

			} else 
				OddSum += i;
			
		}
		System.out.println(
				"The sum of Even numbers for the range of " + BeginningNumber + " to " + EndNumber + " = " + EvenSum);
		System.out.println(
				"The sum of Odd numbers for the range of " + BeginningNumber + " to " + EndNumber + " = " + OddSum);
	}
}