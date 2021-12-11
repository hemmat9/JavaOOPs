package com.syntax.class17;

public class Cow {

	static int price = 5;
	String name;
	String breed;
	String color;
	int age;
	double weight;

	public Cow() {
		System.out.println("Important line of code");
	}

	public Cow(String name) {
		this.name = name;// this.name = name;//this keyword distinguish between the instance variable and
							// local variable
	}

	public Cow(String name, String breed) {
		this(name);
		this.breed = breed;
	}

	public Cow(String name, String breed, String color) {
		this(name, breed);
		this.color = color;
	}

	public Cow(String name, String breed, String color, int age) {
		this(name, breed, color);
		this.age = age;
	}

	public Cow(String name, String breed, String color, int age, double weight) {
		this(name, breed, color, age);
		this.weight = weight;
	}

	void printName() {
		System.out.println(name);
	}

	void printAllInfo() {
		System.out
				.println("name " + name + " breed " + breed + " color " + color + " age " + age + 
						" wieght " + weight+ " price "+price);
	}
}
