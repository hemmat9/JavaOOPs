package com.syntax.class06;

public class WhileLoop {

	public static void main(String[] args) {
		// loop is cycle of repetitive code, they are used to repeat a block of code
		// there are 4 types of loops ==> 1.while, 2.do while, 3.for loop, 4. enhanced for loop/advanced for loop.
		
		int time = 16;
		if (time < 17) {
			System.out.println("it is daytime");
		}

		while (time < 17) {// infinite loop

			System.out.println("it is daytime");
		time++;
	}

		System.out.println("I want to print number from 1 to 20");
		
		int num=1;
		while(num<=20) {
			
			System.out.print(num+" ");
			num++;
		}
		System.out.println("end of code");
		}
}
