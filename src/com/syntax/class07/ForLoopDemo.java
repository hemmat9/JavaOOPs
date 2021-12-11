package com.syntax.class07;

public class ForLoopDemo {

	public static void main(String[] args) {
		// for loop is used when we know the condition, it repeats a block of code based
		// on the number of condition, but we use while loop when we don't know how
		// many times code needs to be repeated.

		for (int a = 1; a <= 3; a++) {// variable;condition;inc/dec
			System.out.println("Hello");
		}
		System.out.println("---------- print numbers from 1 to 20------------");
		/*
		 * 1. star point 2. end point 3. increment/decrement
		 */
		for (int b = 1; b <= 20; b++) {
			System.out.println(b + " ");
		}
		System.out.println("---------- print numbers from 100 to 20------------");

		for (int c = 100; c >= 20; c--) {
			System.out.println(c + " ");
		}
		System.out.println("---------- print even numbers from 1 to 50------------");
		for (int d = 1; d <= 50; d++) {
			if (d % 2 == 0) {// we can also do it without if condition  (int d = 2; d <= 50; d+=2);
				System.out.print(d + " ");
			}
		}

	}
}
