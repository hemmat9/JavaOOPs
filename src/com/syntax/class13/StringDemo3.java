package com.syntax.class13;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="This class is easy";
		System.out.println(name.contains("class"));// it shows if the string contains a specific word or letter.
		System.out.println(name.contains("Lemon"));
		System.out.println(name.contains("i"));
		
		String str2="Hello";
		String str3="helhyjhuylo";
		System.out.println(str2.equals(str3));// it shows if two String are same.
		System.out.println(str2.equalsIgnoreCase(str3));// this ignores the case  from two String 
		
		System.out.println(str2.toUpperCase().charAt(4));//shows at this index what letter is located.
		
		System.out.println(str2.indexOf('l',3)); //shows what is the index number for the specific letter if 
												//you want to start from an specific index it is specified with a number after comma
		
		System.out.println(str3.indexOf('l',str3.indexOf('l')+1));// this starts from the next specific letter.
		
		System.out.println(name.substring(10));// ignores the first 5 letters any number you put it will ignore that much characters.
		System.out.println(name.substring(5,11));// this ignores everything but the specified characters between indexes 5-11
	}

}
