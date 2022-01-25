package com.syntax.class14.class14Homework;

public class Class14Homework6 {

	public static void main(String[] args) {
		// How would you check if String is palindrome or not?

		String original = "Madam";
		String Rev_Orig = "";

		for (int i = original.length() - 1; i >= 0; i--) {

			Rev_Orig = Rev_Orig + original.charAt(i);
		}

		if (Rev_Orig.equalsIgnoreCase(original)) {
			System.out.println(original + " is Polindrome String");
		} else {
			System.out.println(original + " is Not Polinderome String");
		}

		//How would you check if String is palindrome or not?
				String str="racecar";
				StringBuilder strB=new StringBuilder(str);
				strB.reverse();
				if(str.equals(strB.toString())) {
					System.out.println(str+" is palindrome");
				}else {
					System.out.println(str+" is not palindrome");
				}
	}

}