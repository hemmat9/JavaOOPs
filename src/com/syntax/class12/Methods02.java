package com.syntax.class12;

public class Methods02 {
	
	void repeatWords(String word, int times) {
		
		for (int i=0; i<times; i++) {
			System.out.println(word);
		}
		
	}

	void isItRaining(boolean isRain) {
		if (isRain) {
			System.out.println("please take umbrella");
		}else {
			System.out.println("lets go for a walk");
		}
		
	}
}
