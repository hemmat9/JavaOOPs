package com.syntax.class09Homework;

public class HW04 {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all elements in an array

		int num[] = { 10, 45, 58, 56, 95, 100 };
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " + ");
			sum += num[i];
		}
		System.out.println("= " + sum);
		System.out.println("=========================================");
		sum=0;
		for (int number:num) {
			sum+=number;
		}
		System.out.println(sum);
	}

}
