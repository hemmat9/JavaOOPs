package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		/* rules: of switch
		 * values in case MUST be same data type as a Variable in switch.
		 * we can not have duplicate cases
		 */
		char gender = 'f';
		String description;
		switch (gender) {

		case 'm':
			description = "male";
			break;
		case 'f':
			description = "female";
			break;
		default:
			description = "unknown";

		}
		System.out.println(gender + " means " + description);
		
		/*
		 * limitation: of switch
		 * 1. we cannot use logical operators (&&,||, !)
		 * 2. we can not use relational operators(>,<,=)
		 * 3. only used for equality of variables 
		 * limitation of data types:
		 * 1. boolean condition can not be used in the switch cases
		 * 2. double/float/long cannot be used in switch cases because there is too many variations of these data types but we can use(integer, String, char, byte).
		 */
	}

}
