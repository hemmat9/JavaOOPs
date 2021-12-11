package com.syntax.class04;

import java.util.Scanner;

public class DMVLicense {

	public static void main(String[] args) {
		// You are DMV representative and you need to ask customer their age. If they
		// are 18 and older you will issue a driver license to them, otherwise you will
		// offer them to get a learners permit.

		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = scanner.nextInt();
		if (age >= 18)
			System.out.println("I will issue your Driving license.");
		else
			System.out.println("I am offering you a learners permit.");
	}

}
