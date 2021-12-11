package com.syntax.class03;

import java.util.Scanner;

public class TemperatureCheck {

	public static void main(String[] args) {
		// Create variable to store temperature. Your program should check if
		// temperature is below 32 then it should print “Water will freeze with
		// temperature __”, otherwise “Water will NOT freeze with temperature __”.
		Scanner scanner= new Scanner (System.in);
		System.out.println("Please enter the temperature in F");
		int temp1=scanner.nextInt();
		if (temp1<32) {
			System.out.println("Water will freez with "+temp1);
		}else if(temp1>120&&temp1<500) {
			System.out.println("Water will boil with "+temp1);
		
		}else {
			System.out.println("Water will Not freeze with "+temp1);
		
		}
	}

}
