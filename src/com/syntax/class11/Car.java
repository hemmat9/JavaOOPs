package com.syntax.class11;

public class Car {
 
	
	String make;
	String Model;
	String color;
	int year;
	double milage;
	// to define behaviors(the things an object is able to do) the keyword void is used/void keyword is used to define the behaviors.
	void moveForwad() {
		System.out.println("This car can move forward");
		//applyBreaks();// we can call a behavior in another behavior(calling a method)
	}
	void applyBreaks() {
		System.out.println("it can apply breaks");//defining a method 
	}
	
	
	
	public static void main(String[] args) {
		
		Car FarhadsCar = new Car();
		FarhadsCar.make="Tesla";
		FarhadsCar.Model="S";
		FarhadsCar.color="White";
		FarhadsCar.year=2021;
		FarhadsCar.milage=1000;
		
		System.out.println("Farhad's car is a "+ FarhadsCar.make);
		System.out.println("His car models is "+ FarhadsCar.Model);
		System.out.println("His car color is "+ FarhadsCar.color);
		System.out.println("His car milage is "+ FarhadsCar.milage);
		FarhadsCar.moveForwad();
		FarhadsCar.applyBreaks();
	}
}
