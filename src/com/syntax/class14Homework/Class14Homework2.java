package com.syntax.class14Homework;

public class Class14Homework2 {

	public static void main(String[] args) {
		// Create a String that should be combination of letters, numbers and special
		// characters. Find out how many alpha characters are there in the String.

		String str2 = "aklsdfja345435FFF!@#$%^7*(";
		
		System.out.println(str2.replaceAll("[^A-Za-z0-9]", "").length());//alpha refers to AlpahNumeric in Java(A-Z and 0-9) not the special characters.
		
	}
}
