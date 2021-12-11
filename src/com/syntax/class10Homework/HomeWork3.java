package com.syntax.class10Homework;

public class HomeWork3 {

	public static void main(String[] args) {
		// Create a 2D array in which first array will consist of 4 names and second
		// array will contain grades. Then your program should print name of the
		// students that has A and B grade

		String[][] names = { { "John", "Smith", "Scott", "Susan" }, { "A", "B", "F", "D" } };
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				
				if (names[i][j].equals("A") || names[i][j].equals("B")) {
					
					System.out.println(names[i - 1][j] + " " + names[i][j]);
				}
			}
		}
	}
}
