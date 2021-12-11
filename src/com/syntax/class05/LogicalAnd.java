package com.syntax.class05;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {

		boolean understandJava = true;
		boolean enjoyJava = true;
		boolean teachJava = true;
		
		if (understandJava && enjoyJava && teachJava) { // for multiple statement for one condition use &&.
			System.out.println("That is awesome");
		} else {
			System.out.println("You probably need to study more");
		}

		/*
		 * ask a user to enter a number based on the entered # we will define if number
		 * is small, medium or large if number is between 1 and 10 ---> small if number
		 * is between 11 and 100 ---> medium if number is between 101 and 1000 --->
		 * large if number is more than 1001 ---> x large
		 */
		Scanner number = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = number.nextInt();
		if (num >= 1 && num <= 10) {
			System.out.println("The number is small");
		} else if (num >= 11 && num <= 100) {
			System.out.println("The number is medium");
		} else if (num >= 101 && num <= 1000) {
			System.out.println("The number is large");
		} else if (num >=1001)
			System.out.println("The number is X-Large");
	}

}
