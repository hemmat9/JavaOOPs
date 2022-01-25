package com.syntax.class12.class12Homework;

public class PrimeNumber {
//Write a method to return whether given number is prime or not?

	void number (int numb) {
		
		if (numb>1) {
			
			for (int i =2; i<numb; i++) {
				if (numb%i==0) {
					System.out.println(numb+ " is not a prime number ");
					break;
				}else {
					System.out.println(numb+ " is a pirme number");
					break;
				}
				
			}
		}else {
			System.out.println(numb+ " is not a prime number");
		}
	}
	
	public static void main (String []args) {
		
		PrimeNumber number = new PrimeNumber();
		number.number(2);
	}
		

}