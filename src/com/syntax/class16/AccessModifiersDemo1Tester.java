package com.syntax.class16;

public class AccessModifiersDemo1Tester {

	public static void main(String[] args) {
		
		AccessModifiersDemo1 am = new AccessModifiersDemo1();
		
		//am.name="Nabil";// we can not access name because it is private variable.
		am.age=22;
		am.salary=120000;
		am.displayAge();
		am.displaySalary();
		am.displayName();
	}

}
