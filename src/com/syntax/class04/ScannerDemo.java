package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo {
	// short cut to import existing class of scanner to the current class 
	// mac: cmd+shift+o
	//windows: ctrl+shift+o
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name= scan.next();//it will capture string value from console
		System.out.println("Hello " + name);
		System.out.println("Please enter your age");
		int age =scan.nextInt();
		System.out.println(name + " you are " + age+ " years old");
		
	}

}
