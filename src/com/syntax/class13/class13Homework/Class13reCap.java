package com.syntax.class13.class13Homework;

import java.util.Arrays;

public class Class13reCap {

	public static void main(String[] args) {


		String name= "Farhad";
		System.out.println(name.length());//shows number of character
		System.out.println(name.startsWith("F"));//boolean
		System.out.println(name.endsWith("d"));//boolean
		System.out.println(name.contains("a"));//boolean
		System.out.println(name.equals("Farhad"));//boolean
		System.out.println(name.equalsIgnoreCase("Farhad"));//boolean
		System.out.println(name.charAt(5));// returns the character of that index
		System.out.println(name.indexOf("d"));//finds the index number of the letter, prints the first occurrence of that letter 
		System.out.println(name.indexOf("a", 4));// this is how we can get the second occurrence of the letter
		System.out.println(name.substring(3));// it returns the number of character starts from 3 onward and 3 is included
		System.out.println(name.substring(3, 5));//it shows the specified number of characters 
		System.out.println(name.isEmpty());//it shows if the string is empty or not.
		System.out.println(name.trim());//removes the spaces from the end and start of a string
		
		String sentence ="This is a Java class";
		System.out.println(sentence.split(" ").length);//returns the number of words/ with a space between quotation it will return the number of words.
		System.out.println(Arrays.toString(sentence.split(" ")));//returns the sentence into Array then prints it word by word.
		System.out.println(sentence.split(" ")[4]);//returns the first word of the string
		
		

	}

}
