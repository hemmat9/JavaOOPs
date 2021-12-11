package com.syntax.class17Homework;

//Write a java class that have 4 constructors with 4 different access levels of 
//constructors(private,public,default,protected) and create 4 objects of this class:
//1 - inside same class; 2 - from outside the class; 3 - from different class inside
//different package  and observe result.
public class HomeWork1 {
	String name;
	int age;
	double salary;

	HomeWork1() {
		System.out.println("This is a default Constructor");
	}
	public HomeWork1(String name) {
		name="Farhad";
		System.out.println(name+" This is a public Constructor");
	}
	private HomeWork1(String name, int age) {
		age=34;
		System.out.println(name+" "+age+" This is a Private Constructor");
		
	}
	protected HomeWork1(double salary) {
		salary=120000;
		System.out.println(salary+" This is a protected Constructor");
	}
	public static void main(String[] args) {
		new HomeWork1();
		new HomeWork1("Farhad");
		new HomeWork1("Farhad", 34);
		new HomeWork1(120000);
	}
}

