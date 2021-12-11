package com.syntax.class07Homework;

import java.util.Scanner;

public class HW2Class7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double price = 15;
		System.out.println("What do you want to buy?");
		String Item = scanner.next();
		System.out.println(Item + " costs you $" + price);
		System.out.println("Please pay for the " + Item);
		int paid = scanner.nextInt();

		while (paid != price) {

			if (paid <= price) {
				System.out.println("You paid $" + paid + " Please pay more!");
				paid = scanner.nextInt();
			} else if (paid > price) {
				System.out.println("You paid $" + (paid - price) + " extra let me give you the change please.");
				break;
			}
		}

		System.out.println("Thank you for shopping");

	}
}