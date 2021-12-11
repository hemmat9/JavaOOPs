package com.syntax.class04;

public class NestedIfMoreExamples {

	public static void main(String[] args) {

		boolean ReplCompleted = true;
		int assignments = 5;

		if (ReplCompleted) {
			if (assignments > 16) {
				System.out.println("You did an amazing work");
			} else if (assignments > 10) {
				System.out.println("you did good, but you shuold do more");
			} else if (assignments > 6) {
				System.out.println("you need to try do more hw");
			} else {
				System.out.println("why?");
			}
		} else {
			System.out.println("please make sure you do your homework");

		}
	}
}