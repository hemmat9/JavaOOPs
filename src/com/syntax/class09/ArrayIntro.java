package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		/* Arrays are used to store multiple same type of values(elements) inside one
		 * variable, it stores the values based on indexes starting from 0([0], [1], [2]....)
		 */

		int[] array = new int[4];
		array[0] = 12;
		array[1] = 10;
		array[2] = 13;
		array[3] = 14;
		System.out.println(array[2] + array[0]);
		System.out.println(array[3]);
		// I need to create any array that will hold 3 elements of double type of values

		double[] arr = new double[3];
		arr[0] = 12.33;
		arr[1] = 13.55;
		arr[2] = 1.355;
		System.out.println(arr[0]);
		System.out.println("        -------------------------------     ");

		// I want to create any array that will store 4 colors
		String[] colors = new String[4];
		colors[0] = "Red";
		colors[1] = "blue";
		colors[2] = "green";
		colors[3] = "white";
		// colors[4]="black"; // this will not run because we indicated [4] elements(out
		// of bound Exception)

		System.out.println(colors[2]);
		// if I want to see how many (size) elements are there inside an array.
		System.out.println(colors.length);
		// if we don't have value for an array the default value will be printed like:
		// null; 0, 0.0.....etc
		String[] color = new String[4];
		color[1] = "blue";
		color[2] = "green";
		color[3] = "white";
		System.out.println(color[0]);
	}

}
