package com.syntax.class15;

public class SyntaxStudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SyntaxStudent Farhad = new SyntaxStudent();
		Farhad.name="Farhad";
		Farhad.ID="123";
		Farhad.calculateFee();
		//System.out.println(Farhad.school);//this is not recommended
		System.out.println(SyntaxStudent.school);//use the name of the class
		// and call it. 
		
		
	}

}
