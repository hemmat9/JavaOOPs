package com.syntax.class16;

public class Task03 {

	//Create a method that will accept a String as a parameter and return a new String that consist only of vowels. 
	//Method should be available inside the class only where it was declared and executed by calling it is name.
	
	private static String processString(String str) {
		
		return str.replaceAll("[^aeiouAEIOU]", "");//it is called regular expression
	}
	

	
	public static void main (String [] args) {
		
		System.out.println(processString("Farhad"));
		
		
		
		
		
	}
	
}
