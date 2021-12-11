package com.syntax.class10Homework;

public class HomeWork4 {

	public static void main(String[] args) {
		// Using 2D array create a grocery list.
		// Inside you should have an array of veggies, fruits, dairy and sweets.
		// Retrieve all values from that array using 2 different loops

		String[][] groceries = {

				{ "Tomato", "Potato", "Onion", "Lettuce" }, { "Milk", "Yogurt", "Cheese", "Butter" },
				{ "Cookies", "Chocolate", "M$Ms", "Cake" } };
		for (int i = 0; i < groceries.length; i++) {
			for (int j = 0; j < groceries[i].length; j++) {
				System.out.print(groceries[i][j] + ", ");
			}
		}
		System.out.println();
		for (String[] grocery : groceries) {
			for (String g : grocery) {
				System.out.print(g + ", ");
			}
		}
	}
}
