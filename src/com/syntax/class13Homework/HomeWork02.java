package com.syntax.class13Homework;

public class HomeWork02 {

	public static void main(String[] args) {
		// Create a String and if the String is not empty perform the following:
		// if the String has an odd number of characters and has 3 or more characters,
		// print the character in the middle of the String.

		String str = "Smith";

		if (!str.isEmpty()) {

			if (str.length() % 2 != 0 && str.length() >= 3) {

				System.out.println("The middle character of " + str + " is the letter " + str.charAt(str.length() / 2));

			} else {
				System.out.println("The charcters are even");
			}

		} else {
			System.out.println("The String is empty.");
		}
	}

}
