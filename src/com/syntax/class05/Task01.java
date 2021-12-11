package com.syntax.class05;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// Prompt the user to enter person heights in inches. Person should be
		// classified as one of the following:
		// short (under 60 inch)
		// medium(between 60 -72 inch)
		// tall (over 72 inch)

		Scanner heights = new Scanner(System.in);
		System.out.println("Please enter heights in inches!");
		int inche = heights.nextInt();
		if (inche <= 60) {
			System.out.println("The person is short");
		} else if (inche >= 61 && inche <= 71) {
			System.out.println("The person is medium");
		} else {
			System.out.println("The person is tall");

		}
	}
}
