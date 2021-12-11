package com.syntax.class16;

public class Task02 {

	//Create a method that will take a String as a parameter and returns reversed String. 
	//Method should be available to all classes within your project and accessible by class name.
	
	public static String reverseStr(String str) {
		///StringBuilder stringbuilder=new StringBuilder (str);
		//stringbuilder.reverse();
		//String newStr=stringbuilder.toString();
		//return newStr;
		
		return new StringBuilder(str).reverse().toString();
			
		}
	}

