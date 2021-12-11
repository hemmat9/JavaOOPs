package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {

		boolean vaccine = true;
		int dose = 2;
		if (vaccine) {
			System.out.println("How many doses have you taken?");

			if (dose == 1) {
				System.out.println("When are you taking your 2nd dose?");
			} else 
				System.out.println("You are fully vaccinated");
			
		}
		System.out.println("__________________________________");

		String day = "Monday";
		int date = 13;
		int time = 22;
		if (day.equals("Friday")) {
			System.out.println("I am going to the movie");

			if (date == 13) {
				System.out.println("I am watching a scary movie");
			} else {
				System.out.println("I am watching a comedy today");
			}

		} else {
			System.out.println("I am going to study");

			if (time > 23)
				;
			System.out.println("Go to sleep");
		}

	}

}
