package com.syntax.class12.class12Homework;

public class HWHello {
	//Create a method that will say Hello in different 
	//language based on the country that will passed when method is executed.

	void greetings(String country) {
		if (country.equalsIgnoreCase("United States")) {
			System.out.println("Hello");
		} else if (country.equalsIgnoreCase("Afghanistan")) {
			System.out.println("Salam");
		} else if (country.equalsIgnoreCase("France")) {
			System.out.println("Salut");
		} else if (country.equalsIgnoreCase("Saudi Arabia")) {
			System.out.println("Ahlan wa Sahlan");
		} else {
			System.out.println("Please enter another country");
		}

	}

}
