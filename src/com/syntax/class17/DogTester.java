package com.syntax.class17;

public class DogTester {

	public static void main(String[] args) {
		
		Dog dog=new Dog("Boby","Black","BullDog",10,5);
		//dog.name="Boby" not allowed as it is private
		dog.printName();
		//now we can access the private instances because we entered the fields.
		dog.printAge();
		dog.printBreed();
	}

}
