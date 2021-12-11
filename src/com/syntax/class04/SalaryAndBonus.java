package com.syntax.class04;

import java.util.Scanner;

public class SalaryAndBonus {

	public static void main(String[] args) {
		// Write a program to ask user to enter numbers of worked years and annual
		// salary. If user worked for more or equals to 5 years than user is eligible
		// for the bonus, otherwise he is not. Once user is eligible and salary is
		// larger than 50000 than bonus = 5000, otherwise bonus=3000.
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many years did you work?");
		int years= scanner.nextInt();
		System.out.println("How much is your salary?");
		int salary= scanner.nextInt();
		if (years>=5) {
			if (salary>=50000) {
				System.out.println("You are eligible for $5000 bonus.");
			} else {
				System.out.println("You are eligible for $3000 bonus.");
			}
			
		} else {
			System.out.println("You are not eligible for a bonus");
		}
		
		
		
		
		
	}
}
