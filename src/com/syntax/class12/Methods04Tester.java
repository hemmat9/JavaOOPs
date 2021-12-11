package com.syntax.class12;

public class Methods04Tester {

	public static void main(String[] args) {
		
		Methods04 canBeAnyName = new Methods04();
		
		System.out.println(canBeAnyName.method1()); // prints "Sandy"
		
		
		
		System.out.println(canBeAnyName.method2("Roman"));// prints what ever value we give to it, because it is not assigned to a name.
		System.out.println(canBeAnyName.method1());// method1 is assigned to a value it will return that value.
		canBeAnyName.method4("Farhad");//because it is a void method there is no need for syso
		canBeAnyName.method3();// this void method is assigned to print "Mandy".
		System.out.println(canBeAnyName.method5("Mustafa"));// prints out "Ayesha" always because it is assigned to it.
	}

}
