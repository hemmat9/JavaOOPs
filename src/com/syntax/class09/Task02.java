package com.syntax.class09;

public class Task02 {

	public static void main(String[] args) {
		// Create an array of words: Java, Saturday, day, coding, is. Print the
		// following sentence using elements of array: “Saturday is Java coding Day”.
		
		
		
		String[] words = { "Java", "Saturday", "day", "coding", "is","love", "class", "fun" };
		System.out.println(words[1] + " " + words[4] + " " + words[0] + " " + words[3] + " " + words[2]);
		
		System.out.println("------------------------------");
		
		for (int i=0;i<words.length; i++) {
			
			System.out.print(words[i]+ " ");
			
		}
	}

}
