package com.syntax.class10;

public class TwoDArraysDemo2 {

	public static void main(String[] args) {
		// let's create an 2D arrays of groceries.

		String[][] groceries = {{ "banana", "apple", "mango" }, { "potato", "tomato" }, { "milk", "cheese", "ayram", "yogurt" }};

		System.out.println(groceries.length);// # of arrays
		
		
		System.out.println(groceries[2][3]);// yogurt

		// I want to find how many elements my 1st array has

		System.out.println(groceries[0].length);
		System.out.println(groceries[1].length);
		System.out.println(groceries[2].length);
		// how do we get all elements from 2D array
		
		
		int total = 0;

		for (int i = 0; i < groceries.length; i++) {// iterates over arrays
			for (int j = 0; j < groceries[i].length; j++) {// iterates over elements of each single arrays or columns.

				System.out.print(groceries[i][j] + " ");
				total++;
			}

			System.out.println();
			System.out.println("# of total elements " + total);

		}
	}

}
