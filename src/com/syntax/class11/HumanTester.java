package com.syntax.class11;

import java.util.Scanner;

public class HumanTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Human Farhad = new Human();
		Farhad.name="Farhad";
		Farhad.height=6;
		Farhad.age=34;
		Farhad.gender='M';
		Farhad.bloodType="B+";
		Farhad.eat();
		Farhad.sleep();
		Farhad.walk();
		Farhad.sendMemes();
		
		System.out.println("=======================");
		
		Human Sebastian = new Human ();
		Sebastian.name="Sebastian";
		Sebastian.height=6.2;
		Sebastian.age=25;
		Sebastian.gender='M';
		Sebastian.bloodType="A+";
		Sebastian.eat();
		Sebastian.sleep();
		Sebastian.walk();
		Sebastian.sendMemes();
		
	}

}
