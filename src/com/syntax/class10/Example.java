package com.syntax.class10;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// I want to create an array and store elements using scanner

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter how many elements you want to store inside array of cars?");
		int size = scanner.nextInt();

		String[] cars = new String[size];
		// storing elements inside any array of cars
		for (int i = 0; i < cars.length; i++) {

			System.out.println("please enter your car");
			cars[i] = scanner.next();
			
			// retrieve all stored elements
		}
		for (String car : cars) {
			System.out.print(car + " ");
		}

	}

}
