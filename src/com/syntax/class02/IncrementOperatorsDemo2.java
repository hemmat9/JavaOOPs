package com.syntax.class02;

public class IncrementOperatorsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;
		int number2 = number + number + number + number;
		System.out.println(number);
		System.out.println(number2);
		number += 10 + 20 + 30 + 40;
		System.out.println(number);

		System.out.println(number - number);

		number = 10;

		number *= 10;
		System.out.println(number);
		System.out.println(number / number);

		number = 100;

		number = number / 10;
		System.out.println(number / 10);

		number--;
		System.out.println(number);
		// number++; Allowed
		// number--; Allowed
		// number%%; Allowed
		// number**; Not Allowed
		// number//; Not Allowed

		String var1 = "Hello world";
		int number1 = 10;
		String result = (var1 + number1);
		System.out.println(var1 + number1);
		boolean isTrue = true;
		System.out.println(result + isTrue);

		double number7 = 10;
		number7++;
		System.out.println(number7++);
	}

}
