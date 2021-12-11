package com.syntax.class17;

public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1= new Student("Farhad",98,99,100);
		student1.printAvgGrade();
	
		Student student2 =new Student("Sharif",99,89,92);
		student2.printAvgGrade();
		
		Student student3 =new Student("Wahab",99,79,92);
		student3.printAvgGrade();
		
		Student student4 =new Student("Ahmad",99,99,92);
		student4.printAvgGrade();
		
		Student student5 =new Student("Ghulam",99,79,92);
		student5.printAvgGrade();
}
}