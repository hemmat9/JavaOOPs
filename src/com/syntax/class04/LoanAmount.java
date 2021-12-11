package com.syntax.class04;

import java.util.Scanner;

public class LoanAmount {

	public static void main(String[] args) {
		// You are a loan specialist and you need to ask user what is the amount of loan
		// is needed. If loan is less or equal to 200,000 then you would lend the money
		// otherwise you would reject the client.

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Loan amount needed?");
		double loan = scanner.nextDouble();
		
		if (loan <= 200000) {
			System.out.println("This amount of loan can be provided.");
		} else
			System.out.println("Loan amounted is rejected.");
	}

}
