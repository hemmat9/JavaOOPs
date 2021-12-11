package com.syntax.class09;

public class Task01 {

	public static void main(String[] args) {
		// Create an array of char and store grades into it:A,B,C,D,E,F. Then print a
		// grade B.
		char[] array = new char[6];
		array[0] = 'A';
		array[1] = 'B';
		array[2] = 'C';
		array[3] = 'D';
		array[4] = 'E';
		array[5] = 'F';
		System.out.println(array[1]);
		System.out.println("=====================================");

		char[] gender;// declaring an array
		gender = new char[2];// initializing it's size

		// 2 way of creating an array

		char[] gradesArray = { 'A', 'B', 'C', 'D', 'E', 'F' };// 6 indexes
		System.out.println(gradesArray.length);
		System.out.println("Elements with index 2 is " + gradesArray[2]);

		System.out.println("==============================================");

		String[] names = { "Farhad", "Wahab", "Towfiq", "Yusuf" };
		names[2] = "Ibrahim";
		System.out.println(names[2]);
		System.out.println("===========================================");
		int[] numbers = { 1, 5, 6, 8, 9, 4, 2, 3, 10, 23 };
		System.out.println(numbers.length);
		System.out.println(numbers[5]);
		// we can not declare an array separately if we want to store values in shorter
		// way, compiler will complain on the second line.
		// int [] num;
		// num={10,12,13,14,15};

	}

}
