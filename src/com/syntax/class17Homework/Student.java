package com.syntax.class17Homework;
//Write a Student class   that have instance variables name and address.
	//Create a constructor that will initialize those variables.
	//Print name & address of given  student using displayInfo method.
public class Student {

	private String name;
	private String address;
	
	public Student (String studentName, String studentAddress){
		name=studentName;
		address=studentAddress;
	
	}
	
	public void printInfo() {
		System.out.println(name+" "+address);
	}
}
