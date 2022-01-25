package com.syntax.reveiwClass6;

public class Doctor {
//instances are declared inside the class, outside of the block of code 
	// copies of instance variables are given to every object we create out of this class.
	String name;
	String lastName;
	String speciality;
	double salary;
	
	static String hospital="John Muir";//static variables belong to the class, if the value of static gets changed in one of the objects it will effect it.
	// we can have static methods and void method.
	
	Doctor(String name, String lastName, String speciality, double salary){
		this.name=name;
		this.lastName=lastName;
		this.speciality=speciality;
		this.salary=salary;
		System.out.println(name+" "+lastName+" "+speciality+" "+salary);
	}
	
	Doctor(String name, String lastName, String speciality){//for the second constructor parameters needs to be changed
		this.name=name;
		this.lastName=lastName;
		this.speciality=speciality;
		System.out.println(name+" "+lastName+" "+speciality+" "+salary);
	}
	
	void treatPatient(String name) {
		System.out.println("Doctor "+this.name+" treats patients "+ name);
		
	}
	
	void printInfo() {//instance method no parameters
		System.out.println(name +" "+ lastName+" is a "+speciality);
	}
	
	void work() {
		System.out.println(name+ " works at hospital "+hospital);
	}
	void getPaid() {
		System.out.println(name +" gets paid "+salary);
	}
	static void companyName() {//static method call only work with static members
		System.out.println("All doctors work at "+hospital );
	}
}
