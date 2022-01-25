package com.syntax.class12.class12Homework;

import java.util.Scanner;

public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student grade = new Student();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter stuedetn's score");
		int num = scanner.nextInt();
		System.out.println("Grade "+ grade.getGrade(num));
	}

}
