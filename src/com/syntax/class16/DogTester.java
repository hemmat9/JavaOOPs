package com.syntax.class16;

public class DogTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dog dog1 = new Dog();
		dog1.name="Casper";
		dog1.displayName();
		Dog.DisplayLegs();
		
		
		Dog dog2= new Dog();
		dog2.name="Babli";
		dog2.displayName();
		Dog.DisplayLegs();
		
		Dog dog3 = new Dog();
		dog3.name="Oban";
		dog3.color="brown";
		dog3.displayName();
		Dog.DisplayLegs();
		dog3.printInfo();
	}

}
