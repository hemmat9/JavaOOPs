package com.syntax.class11;

public class DogTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog alonasDog= new Dog();
		alonasDog.name="Lexy";
		alonasDog.breed="american hound";
		alonasDog.color="Black";
		alonasDog.height=2.5;
		alonasDog.age=10;
		alonasDog.gender='M';
		
		System.out.println("My dog Name is "+alonasDog.name);
		System.out.println("His breed is "+alonasDog.breed);
		System.out.println("His color is "+alonasDog.color);
		
		
		Dog jimmaysDog = new Dog();
		jimmaysDog.name="Tedy";
		jimmaysDog.breed="Labrador retriever";
		jimmaysDog.color="Golden";
		jimmaysDog.height=5;
		jimmaysDog.age=12;
		jimmaysDog.gender='M';
		
		System.out.println("My dog Name is "+jimmaysDog.name);
		System.out.println("His breed is "+jimmaysDog.breed);
		System.out.println("His color is "+jimmaysDog.color);
		
		Dog arwasDog= new Dog();
		arwasDog.name="Manroe";
		
		System.out.println("Arwas Dog name is "+arwasDog.name);
	}

}
