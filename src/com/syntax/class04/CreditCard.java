package com.syntax.class04;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		// Create a Java program that will ask if user has a credit card or not. If you
		// user does not have a credit card then offer them. If they do have one ask
		// what is balance on the card? If balance of the card is larger than 1000, tell
		// them to pay off immediately, otherwise you can tell them that they can spend
		// more.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Do you have a Credit card? Answer Yes or No");
		String answer = scanner.nextLine();

		if (answer.equalsIgnoreCase("Yes")) {// if you want to avoid case sensitivity .equalsIgnoreCase

			System.out.println("What is balance on the Card?");
			int amount = scanner.nextInt();
			if (amount > 1000) {
				System.out.println("Pay off immediately.");
			} else {
				System.out.println("You can spend more.");
			}

		} else {
			System.out.println("I am offering you a credit card through our bank");
		}

	}
}
