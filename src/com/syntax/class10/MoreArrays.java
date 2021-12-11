package com.syntax.class10;

public class MoreArrays {

	public static void main(String[] args) {

		// I want to create an array to store my grades once print them, and then print them reverse.

		char[] grades = { 'A', 'D', 'A', 'B', 'C' };

		for (char grade : grades) {

			System.out.print(grade);
		}
		System.out.println();
		
		
		// reverse way

		for (int i = grades.length - 1; i >= 0; i--) {

			System.out.print(grades[i]);
		}

	}

}
