package com.syntax.class05;

public class SwitchCases {

	public static void main(String[] args) {
		// Switches cases are used to int Month = 1;
		int Month = 2;
		String MonthNames=null;
		if (Month == 1) {
			MonthNames="January";
		} else if (Month == 2) {
			MonthNames="Febraury";
		} else if (Month == 3) {
			MonthNames="March";
		} else if (Month == 4) {
			MonthNames="April";
		} else if (Month == 5) {
			MonthNames="May";
		} else if (Month == 6) {
			MonthNames="June";
		} else if (Month == 7) {

		}
		System.out.println(MonthNames);
	
		switch (Month) {
		
		case 1: 
			System.out.println("January");
			break;
		case 2: 
			
			System.out.println("Febraury");
			break;
		case 3:
		
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		}
	
	
	
	
	}
	
	
	
}
