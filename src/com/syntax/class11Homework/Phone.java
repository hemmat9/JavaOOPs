package com.syntax.class11Homework;

public class Phone {
//Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia with specific  attributes and behaviors.
		String name;
		String brand;
		String colors;
		int weight;
		String display;
		String made;

		public static void main(String[] args) {
		Phone iPhone = new Phone();
		iPhone.name = "iPhone";
		iPhone.made = "United States";
		iPhone.display = "HD Display";
		iPhone.weight = 180;
		iPhone.colors = "Black, white, red, gold";
		System.out.println("Name: " + iPhone.name);
		System.out.println("Made in: " + iPhone.made);
		System.out.println(iPhone.name + " has " + iPhone.display + " Display");
		System.out.println(iPhone.name + " is available in colors " + iPhone.colors);

		System.out.println("========================================================");
		Phone Nokia = new Phone();
		Nokia.name = "Nokia";
		Nokia.made = "Finland";
		Nokia.display = "IPS LCD";
		Nokia.weight = 160;
		Nokia.brand = "Nokia";
		Nokia.colors = "Black, white, red";
		System.out.println("Name: " + Nokia.name);
		System.out.println("Made in: " + Nokia.made);
		System.out.println(Nokia.name + " has " + Nokia.display + " Display");
		System.out.println(Nokia.name + " is available in colors " + Nokia.colors);
		System.out.println("==================================================");
		Phone Andriod = new Phone();
		Andriod.name = "Andriod Phone";
		Andriod.made = "Vietnam";
		Andriod.display = "Full HD and Quad HD";
		Andriod.weight = 170;
		Andriod.brand = "Samsung";
		Andriod.colors = "Black, white, gold";
		System.out.println("Name: " + Andriod.name);
		System.out.println("Made in: " + Andriod.made);
		System.out.println(Andriod.name + " has " + Andriod.display + " Display");
		System.out.println(Andriod.name + " is available in colors " + Andriod.colors);
	}
}
