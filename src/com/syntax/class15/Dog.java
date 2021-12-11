package com.syntax.class15;

public class Dog {
	// we have 3 types of variables local, Static and instance
	// instance variables are those which are outside the method or block of code. we can also use them without initialization.
	// local variable is the variable inside the method or block of code. we must initialize them.
	// Static variables are the same us instance variable with the static keyword, they are outside the method or Block of Code.
	
		static int noOfLegs;//static variables are out side the method and the value of this variable is same for all methods
		String name;//instance variable 
		String color;// instance variable
		
		void sleep() {
			
			int times=3;//local variable 
			System.out.println(times);
			System.out.println(name+ " is sleeping");
			
		}

		void eat() {
			noOfLegs=5;
			System.out.println(name+ " can eat" + noOfLegs);
		}
		
	}


