package com.syntax.reveiwClass6;

public class StringReview {

	public static void main(String[] args) {
		
		String str="Today is Thursday and it is Java Review";
		System.out.println(str.isEmpty());
		
		//str.isfull();//The method isfull() is undefined for the type String
		
		System.out.println(str.length());
		str=str.replace("Thursday", "Monday");
		System.out.println(str);
		String []allwords=str.split(" ");
		System.out.println(allwords.length);
		
		for(String a:allwords) {
			System.out.print(a+ ", ");
			
		}
		System.out.println();
		String give="Hello";
		StringBuilder a = new StringBuilder(give);//we can reverse words and sentences by the help of StringBuilder Class
		a.reverse();
		System.out.println(a);
		
		String b="hello";
		for(int i =b.length()-1; i>=0;i--) {
			System.out.print(b.charAt(i)+" ");
		}
		System.out.println();
		String s ="Today I am happy";
		
		System.out.println(s.substring(6,10));
		
		
	}
}
