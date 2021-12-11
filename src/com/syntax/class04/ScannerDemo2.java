package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {


		Scanner input=new Scanner(System.in);
		System.out.println("Please enter an item you want to buy");
		String Item=input.next();
		System.out.println("Please enter the price of the "+Item);
		double price=input.nextDouble();
		System.out.println("You selected "+Item+" with price = $"+price);
		
	}

}
