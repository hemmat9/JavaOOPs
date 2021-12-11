package com.syntax.class14Homework;

public class Class14Homework1 {

	public static void main(String[] args) {
		// Create a String that will hold a sentence. Write a program to get a new
		// String without any spaces.

		String str = "I love Java class";
		System.out.println(str.replaceAll(" ", ""));
		System.out.println(str);//this is String class that is why it didn't change the value of string variable.
								//that is why String is immutable. but if we use the StringBuilder Class it will assign the change to the String.
		
		StringBuilder str1 = new StringBuilder("I love Java class");
		System.out.println(str1.reverse());
		System.out.println(str1);//here the changes are kept and assigned to the String because StringBuilder Class is mutable. but if we do the same
								// thing with String class it will not keep the change, and it will not assign the changes to the String.
		

	}

}
