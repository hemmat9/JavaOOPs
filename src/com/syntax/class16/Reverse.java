package com.syntax.class16;

public class Reverse {
//Create a method that will take a String as a parameter and returns 
//reversed String. Method should be available to all classes within your 
//project and accessible by class name.

	public void reverse(String string) {
		StringBuilder reverseString = new StringBuilder();

		for (int i = string.length() - 1; i >= 0; i--) {

			reverseString.append(string.charAt(i));

		}
		System.out.println(reverseString);

	}

	public static void main(String[] args) {

		Reverse a = new Reverse();
		a.reverse("Ghafoor is happy");
	}
}
