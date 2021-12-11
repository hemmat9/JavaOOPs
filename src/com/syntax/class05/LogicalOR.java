package com.syntax.class05;

import java.util.Scanner;

public class LogicalOR {

	public static void main(String[] args) {
	
		Scanner CreditCard = new Scanner(System.in);
		System.out.println("Do you have a Credit card?");
		String answer = CreditCard.nextLine();
		if (answer.equals("yes") || answer.equals("yep") || answer.equals("yeap")) {
				System.out.println("please tell me the balance");
	} else {
		System.out.println("do you want to get a credit card?");
	}

	
}
}