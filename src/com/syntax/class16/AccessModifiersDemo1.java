package com.syntax.class16;

public class AccessModifiersDemo1 {
	
	//there are 4 types of access modifiers
	// 1- public
	// 2- default
	// 3- private
	// 4- protected

	private String name;// it can be accessed only inside that specific class
	int age;//default access modifier can be accessed to all classes of a package
	public double salary;// it can be accessed anywhere in java world/ it is a universal variable
	
	
	void displayName() {
		System.out.println(name);
	}
	
	void displayAge() {
		System.out.println(age);
	}
	 void displaySalary() {
		 System.out.println(salary);
	 }
	 
	 
	 public static void main (String [] args) {
		 
		 AccessModifiersDemo1 am = new AccessModifiersDemo1();
		 am.name="Nabil";
		 am.age=25;
		 am.salary=120000;
		 am.displayName();
		 am.displayAge();
		 am.displaySalary();

	 }
}
