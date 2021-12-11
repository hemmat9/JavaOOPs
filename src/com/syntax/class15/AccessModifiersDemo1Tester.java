package com.syntax.class15;

import com.syntax.class16.AccessModifiersDemo1;

public class AccessModifiersDemo1Tester {

	public static void main(String[] args) {
		// this is an example from class 16

		AccessModifiersDemo1 am= new AccessModifiersDemo1();
	
		//am.age=22;// we can't access coz it belongs to that package
		am.salary=120000;//we can access coz it is public
		//am.name="Nabil";//we can't access coz it is private
		
	
	}

}
