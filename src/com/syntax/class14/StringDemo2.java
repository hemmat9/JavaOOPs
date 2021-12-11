package com.syntax.class14;

public class StringDemo2 {

	public static void main(String[] args) {
		// regular expressions
		// if I want to change certain things inside the sentence.
		String str="This is Batch 11 Batch 11 is good";
		
		System.out.println(str.replace("good", "Great").replace("Batch 11", "Batch eleven"));// we can also change characters too 
		System.out.println(str.replaceFirst("Batch", "Bach"));// it changes only the first occurrence of this word or character.
		
		String str2 = "it is a cloudy day, I have to stay home and practice Java";
		
		System.out.println(str2.replace("cloudy", "rainy").replace("practice Java", "Practice manual testing classes"));
	}

}
