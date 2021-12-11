package com.syntax.class03;

public class RelationalOperator {

	public static void main(String[] args) {
		// relational operators =,<,>,%,!
		int number1=12;
		int number2=12;
		boolean result=  number1==number2;
		System.out.println(result);
		System.out.println("*********A*********");
		
		System.out.println(number1==number2); // if the numbers are equal the result will be true.
		
		System.out.println("*********B*********");
		
		int number3=100;
		int number4=1000;
		System.out.println(number3==number4);// if the numbers are not equal the result will be false.
		System.out.println(number3!=number4);
		
		System.out.println("*********C*********");
		
		
		System.out.println(number1>number2);
		System.out.println(number1<number2);
		
		System.out.println("*********D*********");
		
		System.out.println(number1>=number2);// bigger or equal to number 2
		System.out.println(number1<=number2);// smaller or greater than number2
		System.out.println("*********E*********");
		
		System.out.println(number1!=number2);//!= not equal to 
	}

}
