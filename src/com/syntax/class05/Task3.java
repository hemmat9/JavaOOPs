package com.syntax.class05;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		//Ask user to enter 3 numbers and define which is the largest number.

		Scanner number = new Scanner(System.in); 
		System.out.println("Please enter 3 numbers");
		int num1= number.nextInt();
		int num2= number.nextInt();
		int num3= number.nextInt();
		if (num1>num2&&num1>num3) {
			System.out.println(num1+ " is the largest number");
		}else if (num2>num1&&num2>num3) {
			System.out.println(num2 + " is the largest number");
		}else 
			System.out.println(num3+ " is the largest number");
			
}
}
