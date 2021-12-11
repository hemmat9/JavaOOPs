package com.syntax.class06;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the country");
		String country= scanner.nextLine();
		String food=null;
		switch (country.toLowerCase()) {
		case "America":
			food="burgers";
			break;
		case "AFGHANISTAN":
			food="Palaw";
		case "Italy":
			food="Pasta";
			break;
		case "China":
			food="Everythig moves exept planes and cars";
			break;
			default:
				food=("Unknow");
		
		}
		System.out.println("The favorite food of "+country+ " is " + food);
		
	}

}
