package com.syntax.class08;

public class NestedLoops {

	public static void main(String[] args) {
		/*
		 * nested loop is loops inside another loop.
		 */

		for (int i = 0; i <= 9; i++) {// out loop/ out loop controls inner loops

			for (int j = 0; j <= 9; j++) { // inner loop

				for (int k = 0; k <= 9; k++) {
					for (int l = 0; l <= 9; l++) {
						System.out.println(i + ":" + j + ":" + k + ":" + l + "");
					}
				}
			}
		}

	}

}
