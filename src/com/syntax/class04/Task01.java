package com.syntax.class04;

public class Task01 {

	public static void main(String[] args) {

		boolean diploma = false;
		double gpa = 3.5;
		if (diploma) {
			System.out.println("Congradulations");
			if (gpa >= 3.5) {
				System.out.println("You are eligible for Scholarship");
			} else  {
				System.out.println("You should have studied harder");
			}

		} else
			System.out.println("Get a degree");

	}
}
