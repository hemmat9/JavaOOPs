package com.syntax.class07;

public class LoopsDoWhile {

	public static void main(String[] args) {
		/*
		 * what is difference between while loop and do while loop? while checks the
		 * condition first then enters to the body of the code, do while prints the code
		 * then checks the condition. while loop is popular than do loop.
		 * 
		 */
		int a = 1;
		while (a <= 3) {
			System.out.println("Hello");
			a++;
		}

		System.out.println("=====================================");

		int b = 1;

		do {

			System.out.println("Hello bro");
			b++;

		} while (b <= 3);

	}

}
