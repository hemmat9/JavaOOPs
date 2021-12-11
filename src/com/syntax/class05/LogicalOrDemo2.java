package com.syntax.class05;

import java.util.Scanner;

public class LogicalOrDemo2 {

	public static void main(String[] args) {

		/*
		 * ask user to enter today's day if day is Monday or Friday --> no class if day
		 * is Tuesday or Wednesday --> manual class if day is Saturday or Sunday -->
		 * Java class
		 */

		Scanner Days = new Scanner(System.in);
		System.out.println("Please enter day!");
		String day = Days.nextLine();
		String Scedual;
		if (day.equals("Monday") || day.equals("Friday")) {
			Scedual = "No Class";
		} else if (day.equals("Tuesday") || day.equals("Wednesday")) {
			Scedual = "Manual Class";
		} else if (day.equals("Saturday") || day.equals("Sunday")) {
			Scedual = "Java Class";
		} else {
			Scedual = "Invalid Day";

		}
		System.out.println(Scedual);
	}
}
