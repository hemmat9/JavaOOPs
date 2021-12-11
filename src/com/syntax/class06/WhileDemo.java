package com.syntax.class06;

public class WhileDemo {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++");

		int a = 1;
		while (a <= 10) {

			if (a % 2 == 0) {
				System.out.print(a + " ");
			}
			a++;
		}

	}

}
