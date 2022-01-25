package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkCalculator {

	public static void main(String[] args) {
		/*Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user. Please
		 * complete this assignment in 2 ways: using if statement and switch case.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
		double num1 = scanner.nextDouble();
		System.out.println("Please enter a number");
		double num2 = scanner.nextDouble();
		System.out.println("Please enter an operator +|-|*|/|");
		char operator = scanner.next().charAt(0);
		double result = 0;
				if (operator == '+') {
			result=num1+num2;
		}else if (operator == '*') {
			result=num1*num2;
		} else if (operator == '-') {
			result=num1-num2;
		}else if (operator == '/') {
			result=num1/num2;
		} else {
			System.out.println("Invalid Operation");

		}
				System.out.println("Result = "+result);
	}
}
