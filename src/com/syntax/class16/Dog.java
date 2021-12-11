package com.syntax.class16;

public class Dog {

	
	String name;
	static int noOfLegs=4;
	String color;
	
	void displayColor() {
		System.out.println(color);
	}
	void displayName() {
		
		System.out.println(name);
		//System.out.println(noOfLegs);//we can call instance variables inside methods
		//System.out.println(color);
	}
	void printInfo() {
		System.out.println(color);//we can call one method inside another method
		System.out.println(noOfLegs);//we can call static variable inside any other methods
	}
	static void DisplayLegs() {
		//System.out.println(name);//not allowed, we can not call instance variable
		//inside static methods because they are not common
		System.out.println(noOfLegs);
		//System.out.println(color); gives error/b/ color is instance that is why 
	}
}

