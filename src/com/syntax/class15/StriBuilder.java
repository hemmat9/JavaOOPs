package com.syntax.class15;

public class StriBuilder {

	public static void main(String[] args) {
		//String Builder

		String str ="Farhad";
		//String is not recommended here.
		for (int i=0; i<5; i++) {
			str=str+i;
		}
		System.out.println(str);
		
		
		//when you have to change the value of a String variable always use StringBuilder class
		// String class is immutable but StringBuilder class is mutable
		
		//StriBuilder str1= new StriBuilder();
		
			StringBuilder str1 = new StringBuilder("Ahamad");
			for (int i =0; i<5;i++) {
			str1.append(i);//append mean concatenation
		}
		
		System.out.println(str1);
		
		String str2="I am farhad I am married and I have 3 kids";
		StringBuilder strBuilder=new StringBuilder(str2);
		strBuilder.reverse();
		System.out.println(strBuilder);
		System.out.println(str2.toUpperCase());
	}

}
