package com.syntax.class14;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {

		String str= "Today is Tuesday? Today we have java class?";
		String[] strArr=str.split("[?]");//inside the [] we specify at which character it should split. here it is based on question mark. 
		System.out.println(Arrays.toString(strArr));
		
		
		//for (String s:strArr) {// used to get all the elements of a string Array
			//System.out.println(s);
		String str2 = "I have to repeat 3 classes today, class 14, class 15, class16";
		
		String [] strArr2=str2.split("[,]");
		System.out.print(Arrays.toString(strArr2));
		System.out.println();
		}
	}


