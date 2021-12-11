package com.syntax.class06;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the coutry name:");
		String country = scanner.nextLine();
		String language=null;
		switch (country.toLowerCase()) {
		case "usa":
			language = "English";
			break;
		case "afghanistan":
			language = "Pashto & Dari";
			break;
		case "India":
			language = "indian, English & Urdu";
			break;
		case "germany":
			language = "Dutch";
			break;
		case "mexico":
			language = "Maxican";
			break;
		default:
			System.out.println("Unknown");
		}
		if (!language.equals("unknown")) {
		System.out.println(country + " speaks " + language);
	}else {
		System.out.println("Please try another country");

}
}
}