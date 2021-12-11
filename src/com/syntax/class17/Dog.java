package com.syntax.class17;
//constructors are similar to methods 
// Constructor they don't have return type, they always have same name as the class name, 
//as soon we create the object of the constructor class it is executed.

public class Dog {

	private String name;
	private String color; 
	private String breed;
	private int age;
	private double weight;

	public Dog(String dogName,String dogColor, String dogBreed,int dogAge, double dogWeight) {
		//if you want to make it private then you have to put the parameters
		//to access the fields, they have to pass these parameters.
		System.out.println("Dogs constructor is called");
		name=dogName;
		color=dogColor;
		breed=dogBreed;
		age=dogAge;
		weight=dogWeight;
		System.out.println(dogName);
		printAge();
	}
	
	public void printName() {
		System.out.println(name);
	}
	public void printBreed() {
		System.out.println(breed);
	}
	public void printAge() {
		System.out.println(age);
	}
}
