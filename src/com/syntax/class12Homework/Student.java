package com.syntax.class12Homework;

public class Student {
//Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
	//score > 90 - A
	//score >80 - B
	//score >70 - C
	//score > 50 - D
	//anything else - F
	
	char getGrade (int score) {
		char grade;
		if (score>=90) {
			grade= 'A';
		}else if (score>=80 && score<=89) {
			grade= 'B';
		}else if (score>=50 && score<=79) {
			grade ='C';
		}else {
			grade= 'F';
			
		}
		return grade;
		
	}
}
