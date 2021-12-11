package com.syntax.class12;

public class Methods01 {

	int times;
	
	void sayHello(){
		
		System.out.println("Hello Batch 11");
	}
	
	void sayHelloManyTimes() {
		
		for (int i=0; i<3; i++) {
			System.out.println("Hello" +" ");
		}
	}
	void sayHelloManyTimesWithState() {
		times=4;
		for (int i=0; i<times; i++) {
			System.out.println("Hello" +" ");
	}	
	}
	void sayHelloManyTimesWithParameter(int times) {//times is called Parameter
		for (int i=0; i<times; i++) {
			System.out.println("Hi" +" ");
}
}
}