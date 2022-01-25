package com.syntax.class07.class07Homework;

public class HomeWork1class7 {

	public static void main(String[] args) {
		//How to find the sum of even and odd numbers from a given range 
		int a = 100;
		int eSum = 0;
		int oSum = 0;

		for (int i = 1; i <= a; i++) {

			if (i % 2 == 0) {
				eSum += i;
			} else {
				oSum += i;
			}

		}
		System.out.println("The sum of even number =" + eSum);
		System.out.println("The sum of odd number =" + oSum);
	}

}
