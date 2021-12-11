package com.syntax.class13;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="";
		//System.out.println(name.isBlank());// this method was introduced in java 15 or 16 that is why it shows error
		System.out.println(name.isEmpty());
		name="Silva";
		System.out.println(name.isEmpty());
		
		
		String str ="            Batch    11 is ......                  ";
		System.out.println(str.trim());// it removes only leading and trailing spaces not the between character.
		
		String str2="This is an easy class";
		System.out.println(str2.toLowerCase().startsWith("t"));// it will change everything to lower case then checks if it starts with specific letter "t"
		System.out.println(str2.startsWith("T"));// show that this string starts from a specific "T" or not (case sensitive)
		System.out.println(str2.startsWith("L"));
		System.out.println(str2.startsWith("This"));// show that this String starts from specific words "This" or not
		System.out.println(str2.startsWith("T"));
		System.out.println(str2.endsWith("class"));// shows if a sentence ends with a specific word "class" or specific letter "s".
	}

}
