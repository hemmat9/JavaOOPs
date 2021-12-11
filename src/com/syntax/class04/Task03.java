package com.syntax.class04;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// In order to be eligible to donate your blood you have to be 18 years old.
		// Also once you identify age eligibility then we have to see if person matches
		// weight requirements. If person weight is more than 110 lbs → then he/she is
		// eligible, otherwise we cannot accept such a patient.
		Scanner scanner = new Scanner (System.in);
		System.out.println("What is your age?");
		int age = scanner.nextInt();
		System.out.println("What is your weight?");
		int weight = scanner.nextInt();
		if (age >= 18) {
			System.out.println("You are eligible to donate blood.");
			if (weight >= 110) {
				System.out.println("We can accept the patient.");
			} else {
				System.out.println("we can not accept the patient.");
			}

		} else
			System.out.println("You are not eligible to donate blood.");

	}
}
