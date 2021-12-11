package com.syntax.class08;

public class KeyWordBreak {

	public static void main(String[] args) {
		
		for (int i=0; i<=10; i++) {
		
		System.out.println("Almost done");
		break;
	}
		
		for (int i=0; i<=10; i++) {
			
			System.out.println("Almost not done");
			if (i==3) {
				
				System.out.println("About to break the loop");
				break;
			}
		}
		
		boolean summer=true;
		int temp=75;
		
		while (summer) {
			System.out.println("I am happy, I love summer" +temp);
			if (temp>=100) {
				System.out.println("I don't love summer anymore " +temp);
				break;
			}
			temp+=5;
		}
}
}
