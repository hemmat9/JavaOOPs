package com.syntax.class04;

import java.util.Scanner;

public class CityTemp {

	public static void main(String[] args) {
		// Create a Java program that will ask user to input city and temperature. Your
		// program should convert Fahrenheit into celsius and print “The temperature is
		// the city __ is __”

		Scanner city = new Scanner(System.in);
		System.out.println("Please enter your City");
		String cityName = city.nextLine();
		System.out.println("Please enter temperature in Fahrenheit");
		int Fahrenheit = city.nextInt();
		System.out.println("The temperature in the city of " + cityName + " is " + (Fahrenheit - 32) / 2 + " Celcius.");

	}

}
