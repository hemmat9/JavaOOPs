package com.syntax.class06;

public class SwitchCase01 {

	public static void main(String[] args) {
		// if is condition based (true or false)
		int day = 6;
		if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else if (day == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Wrong Day");
		}
		/*switch is a value based we can use it to execute selective matches, just to the value of variable. it can be a
		 * substitute for if condition, if there is no break points all the other codes
		 * will be executed after it finds the value. 
		 * if we are looking for equality then it is preferred to use switch. because it is cleaner and easier. 
		 */

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Wrong day");
			break;
		}
		
	}

}
