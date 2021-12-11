package com.syntax.class02;
public class JavaHomeWork2 {public static void main(String[] args) {
		
		double Number1= 12.5;
		double Number2= 16.5;
		System.out.println("The addition of 2 numbers "+ Number1 +" and "+ Number2 +" is equal to " + (Number1+Number2));
		System.out.println("The subtraction of 2 numbers " + Number1+ " and " + Number2 + " is equal to " + (Number1-Number2));
		System.out.println("The division of 2 numbesr " + Number1+ " and "+ Number2+ " is equal to "+ (Number1/Number2));
		System.out.println("The multiplication of 2 numbers " + Number1+ " and "+ Number2+ " is equal to "+ (Number1*Number2));
		System.out.println("***************");
		double number1=3.9;
		double number2=3.9;
		System.out.println("The squar of the number " + number1 + " is equal to "+ (number1*number2));
		System.out.println("***************");
		int width = 5;
		int height= 8; 
		int perimeter = 2*(8+5);
		int area= (width*height);
		System.out.println("The perimeter of a rectangle with width of " + width + " and height of " + height + " is equal to "+ (perimeter) + " and the area is equal to " + area);
		System.out.println("***************");
		int increase =10;
		increase+=100;
		System.out.println(increase);
		System.out.println("***************");
		int decrease = 100;
		decrease-=67;
		System.out.println(decrease);
		System.out.println("***************");
		int cakePiece=11;
		cakePiece/=4; 
		System.out.println(cakePiece);
		System.out.println(11%4);
		System.out.println("***************");
		int cakepiece=25;
		cakepiece/=7;
		cakepiece=25;
		System.out.println(cakepiece%7);
		System.out.println("If we devide 25 pieces of cake between 7 people, each one will get 3 complete pieces and 4 pieces are left.");
}

}
