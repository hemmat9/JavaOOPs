package com.syntax.class09.class09Homework;

public class HW01 {

	public static void main(String[] args) {
		/*
		 * Create an array of cars and store 6 elements into it. Using 2 different loops
		 * print all values from the array.
		 */

		String[] cars = { "Corola", "Camry", "Highlander", "Rav4", "Tundra", "Tacoma" };

		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + ", ");
		}
		System.out.println();

		for (String a : cars) {
			System.out.print(a + ", ");
		}
	}

}
