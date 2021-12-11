package com.syntax.class16;

public class Recap {
	
	int number;//if I want share this number between all methods we add static keyword
	
	void setNumber(int num) {
		number=num;
	}

	void setConstantNumber() {
		number=100;
	}
	void printNumber() {
		System.out.println(number);
	}
}
