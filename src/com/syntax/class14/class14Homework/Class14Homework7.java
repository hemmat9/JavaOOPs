package com.syntax.class14.class14Homework;

public class Class14Homework7 {

	public static void main(String[] args) {
		// How would you swap 2 strings without a temporary variable?
		
				String str= "Ahmad";
				String str2= "Mahmood";
				
				str=str2+str;
				str2=str.replace(str2, "");
				str=str.replace(str2,"");
				
				System.out.println(str);
				System.out.println(str2);
			
	}

}
