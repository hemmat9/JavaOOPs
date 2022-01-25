package com.syntax.class09.class09Homework;

public class HW03 {

	public static void main(String[] args) {
		// Create an array to store double values and then print those in reverse order

		double num[] = { 15.00, 12.25, 19.66, 45.36 };
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.print(num[i] + ", ");
		}
		System.out.println();
		double[] num1 = new double[5];
		num1[0] = 2.58;
		num1[1] = 12.65;
		num1[2] = 22.55;
		num1[3] = 42.77;
		num1[4] = 52.51;
		System.out.print(num1[4]+" "+num1[3]+" "+num1[2]+" "+num1[1]+" "+num1[0]);
	}
}
