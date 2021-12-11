package com.syntax.class06Homework;

public class HWLoops04 {

	public static void main(String[] args) {
		// Print only odd numbers from 100 to 1

		int a = 100;
		while (a>=1) {
			
			if (a%2!=0) {
				System.out.print(a + " ");
			}
			a--;
		}
	}

}
