package com.syntax.class09.class09Homework;

public class HW02 {

	public static void main(String[] args) {
		// Create an array of animals and store 6 elements into it. Using 2 different
		// loops print all elements from the array.

		String[] animals = { "Horse", "Lion", "Eagle", "Elephant", "Snake", "Cat" };

		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i] + ", ");
		}
		System.out.println();

		for (String a : animals) {
			System.out.print(a + ", ");
		}
	}

}
