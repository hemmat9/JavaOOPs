package com.syntax.class14Homework;

public class Class14homework5 {

	public static void main(String[] args) {
		 //How would you reverse a String word by word?

			String [] sentence="This is sentence i want to reverse".split(" ");//the whole sentence is reversed
			
			String rev=" ";
			
			for (int i=sentence.length-1;i>=0;i--) {
				String word =sentence[i];
				rev+=sentence+" ";
				System.out.print(sentence [i]+ " ");
			}
			
			
		System.out.println();
		
		String str ="This is sentence i want to reverse";// word by word reversed 
		String[]strArr=str.split(" ");
		
		for (String word:strArr) {
			
			StringBuilder stringBuilder= new StringBuilder(word);
			System.out.print(stringBuilder.reverse()+ " ");
		}
		}
		
	}


