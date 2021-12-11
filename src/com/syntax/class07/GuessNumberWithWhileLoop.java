package com.syntax.class07;

import java.util.Scanner;

public class GuessNumberWithWhileLoop {

	public static void main(String[] args) {
		int secretNumber=1;
		Scanner scan=new Scanner (System.in);
		int userNumber;
		
		System.out.println("Please guess my secret number it is between 1--100");
		userNumber=scan.nextInt();
		
		
		while (userNumber!=secretNumber) {
			if (userNumber>secretNumber) {
				System.out.println("The secret number is smaller than "+ userNumber);
			}else if (userNumber<secretNumber) {
				System.out.println("The secret number is bigger than "+ userNumber);
			}
			System.out.println("Please guess my secret number it is between 1--100");
			userNumber=scan.nextInt();
			
		}
		System.out.println("You got it!!!!!");
	}

}
