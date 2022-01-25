package com.syntax.class14.class14Homework;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Class14Homework4 {

	public static void main(String[] args) {
		// How would you reverse a String character by character?

		String str ="Today is Sunday and we have Java class";
		String [] str2=str.split(" ");

		for (String words:str2
			 ) {
			StringBuilder stringBuilder = new StringBuilder(words);
			System.out.print(stringBuilder.reverse() + " ");
		}



		}
			
		}
		



