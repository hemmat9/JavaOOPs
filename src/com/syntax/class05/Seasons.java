package com.syntax.class05;

import java.util.Scanner;

public class Seasons {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month. Based on the month
		 * define the season. Example: if user is born in June, July or August → season
		 * =“Summer�?.
		 * 
		 * At the end of the program we should see output as “You were born is season
		 * 
		 */
		String season;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter your birth month");
		String month= scanner.nextLine();
		if (month.equalsIgnoreCase("January")||month.equalsIgnoreCase("February")||month.equalsIgnoreCase("March")){
			season = "Winter";
		} else if (month.equalsIgnoreCase("April")||month.equalsIgnoreCase("May")||month.equalsIgnoreCase("June")) {
			season = "Spring";
		}else if (month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")||month.equalsIgnoreCase("September")) {
			season = "Summer";
			
		}else {
			season= "Fall";
		}
		
		System.out.println("Your born season is " + season);
	}

}
