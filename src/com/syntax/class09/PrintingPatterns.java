package com.syntax.class09;

public class PrintingPatterns {

	public static void main(String[] args) {
		// printing square

		for (int i = 1; i <= 4; i++) {// outer  loops controls the rows
			for (int j = 1; j <= 5; j++) {//controls the columns
				System.out.print(" * ");
		}
		System.out.println();
	}
		System.out.println("How to print a square 10 X 10");


	for (int i = 1; i <= 10; i++) {// controls the rows
		for (int j = 1; j <= 10; j++) {//controls the columns
			System.out.print(" * ");
	}
	System.out.println();
}
}
}