package com.syntax.class08.class08Homework;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		/*program that will keep asking user to apply for a credit card. As soon you
		 * get �yes� from a user program should stop asking.
		 */

		Scanner scanner = new Scanner(System.in);
		String answer;
		do {
			System.out.println("Apply for a credit card!");
			answer = scanner.nextLine();
		} while (answer.equalsIgnoreCase("No"));
		System.out.println("Thanks");

	}
}