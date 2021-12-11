package com.syntax.class15;

public class DogTester {

	public static void main(String[] args) {

		Dog dog=new Dog();
		dog.name="casper";
		dog.color="Black";
		dog.sleep();
		System.out.println(dog.noOfLegs);
		
		Dog dog2=new Dog();
		dog2.name="caspersky";
		dog2.color="white";
		dog2.sleep();
		dog2.eat();
		System.out.println(dog2.noOfLegs);
	}

}
