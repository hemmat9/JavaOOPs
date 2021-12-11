package com.syntax.class05;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		/*
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules: if the
		 * average score >=90 → grade=A if the average score >= 70 and <90 → grade=B if
		 * the average score>=50 and <70 → grade=C if the average score<50 → grade=F
		 */
		String result = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("What did you get in your quiz?");
		int quiz = scanner.nextInt();
		System.out.println("What did you get in your Mid-term?");
		int midterm = scanner.nextInt();
		System.out.println("What did you get in your Final?");
		int finalExam = scanner.nextInt();
		int average = quiz + midterm + finalExam / 3;
		if (average >= 90) {
			result = "Grade A";
		} else if (average >= 70 && average < 90) {
			result = "Grade B";
		} else if (average >= 50 && average < 70) {
			result = "Grade C";
		} else if (average < 50) {
			result = "Grade F";
		} else {
			System.out.println("Good Luck Next time!");
		}

		System.out.println(result);

	}

}
