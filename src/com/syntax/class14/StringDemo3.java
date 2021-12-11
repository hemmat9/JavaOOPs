package com.syntax.class14;

public class StringDemo3 {

	public static void main(String[] args) {
		//if we want to print certain patterns like signs, numbers, letters

		String str="lkadjADFASDF##$%%&&*2345325M";
		System.out.println(str.replaceAll("[012345]", "*"));
		System.out.println(str.replaceAll("[0-5]", "*"));//you can also specify the range of numbers to be changed to *
		System.out.println(str.replaceAll("[a-z]", "*"));//you can also specify the range of letters to be changed to *//small letter 
		System.out.println(str.replaceAll("[A-Z]", "*"));//Capital letter
		System.out.println(str.replaceAll("[A-Za-z]", "*")); //all small and capital letters
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", "*"));//Carrot sign (^) is use to do not change these patterns but change everything else
		System.out.println(str.replaceAll("[$%#&]", "*"));
		
		String str2="oweiru0934u,xcmWE$%@#$%klsdklafj@#@33343423423";
		System.out.println(str2.replaceAll("[A-Za-z0-9!@#$%^&*(),]","0"));
	}

}
