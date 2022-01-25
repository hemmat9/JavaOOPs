package com.syntax.class10.class10Homework;

public class HomeWork2 {

	public static void main(String[] args) {
		/*
		 * Create 2D array of cars : american, german, korean, italian. Then retrieve
		 * all values from that array using 2 different loops
		 */

		String[][] cars = {
				{ "american", "german", "korean", "italian" }, { "ford", "chevy" }, { "WV", "Mercedez", "BMW" },
				{ "ferrari", "Bugati", "Alfa Romio" }
		};
		for (String[] car : cars) {
			for (String a : car) {
				System.out.print(a + ", ");
			}
			
		}
		System.out.println("--------------------------------------------------");
		System.out.println("Another way to retrieve all the elements");
		for (int i = 0; i < cars.length; i++) {
			for (int j = 0; j < cars[i].length; j++) {
				System.out.print(cars[i][j] + ", ");
			}
			System.out.println();
		}
	}
}
