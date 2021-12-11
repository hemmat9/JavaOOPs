package com.syntax.class09;

public class PrintSquareNumber {

	public static void main(String[] args) {
		// Printing a square of numbers
		for (int r = 1; r <= 4; r++) {// outer loops controls the rows
			for (int c = 1; c <= 5; c++) {// inner controls the columns
				System.out.print(r + " "); // run the code with rows
			}
			System.out.println();
		}
		System.out.println("=====================================");

		for (int r = 5; r >= 1; r--) {// outer loops controls the rows
			for (int c = 1; c <= 5; c++) {// controls the columns
				System.out.print(r + " "); 
			}
			System.out.println();
		}
		System.out.println("=====================================");

		for (int r = 5; r >= 1; r--) {// outer loops controls the rows
			for (int c = 4; c >= 1; c--) {// controls the columns
				System.out.print(r + " "); 
			}
			System.out.println();
		}
	}
}