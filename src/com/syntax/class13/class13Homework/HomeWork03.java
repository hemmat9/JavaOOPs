package com.syntax.class13.class13Homework;

public class HomeWork03 {

	public static void main(String[] args) {
		// Create a String and print it in reverse order (Sunday → yadnuS).

		String day = "Farhad";
		String reverse = "";

		for (int i = day.length() - 1; i >= 0; i--) {//-1 because index starts from 0

			reverse = reverse + day.substring(i, i + 1);
			//reverse+=day.charAt(i)// this also works
		}
		System.out.print(reverse);

	}

}
