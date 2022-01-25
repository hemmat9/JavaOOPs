package com.syntax.class12.class12Homework;

public class HWEvenOddNum {
//Create a method that will take a number and prints whether the number is even or odd.

	void number(int num1) {
		if (num1 % 2 == 0) {
			System.out.println(num1 + " is an even number.");
		} else if (num1 % 2 != 0) {
			System.out.println(num1 + " is an odd number");
		}
	}
}
