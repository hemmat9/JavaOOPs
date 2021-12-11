package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			if (i == 3) {
				continue;// it escapes the iteration number inside the if condition. and continues from
							// the beginning. while break keyword stops the code from farther execution.
			}

			System.out.println("Hello " + i);
		
	}

	for (int i=1; i<=10; i++) {
		
		if (i==3 || i==7 || i==9) {
			continue;
		}
		System.out.print(i+" ");
		
	}
	System.out.println("end of the code");
}
}