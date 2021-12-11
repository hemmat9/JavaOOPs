package com.syntax.class15Homework;

public class StudentTester {

	public static void main(String[] args) {
		

		Student Farhad =new Student();
		Farhad.studentName="Farhad";
		Farhad.studentID="S050";
		Farhad.numberOfStudents++;
	
		
		Student Sharif= new Student();
		Sharif.studentName="Sharif";
		Sharif.studentID="S050";
		Sharif.numberOfStudents++;
		
	
		Student Maryam= new Student();
		Maryam.studentName="Sharif";
		Maryam.studentID="S050";
		Maryam.numberOfStudents++;
		System.out.println(Student.numberOfStudents );//Class name should be called here
	}

}
