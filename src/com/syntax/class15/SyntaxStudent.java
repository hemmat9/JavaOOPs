package com.syntax.class15;

public class SyntaxStudent {

	static String school="Syntax";//static is a memory which holds the same value 
	//shared will all areas.
	static int durationOfCourse=6;
	String name;
	String ID;
	
	void calculateFee() {
		
		int currentMonth=3;
		double tax=0.10;
		System.out.println(name+ " has to pay "+currentMonth*1000+1000*tax);
		
		
	}
}
