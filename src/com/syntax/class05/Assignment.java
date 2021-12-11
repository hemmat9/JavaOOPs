package com.syntax.class05;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
	
		
		Scanner in = new Scanner(System.in);
		System.out.println("please enter current time");
		
		int time=in.nextInt();
		
		if(time>=1 && time<=11) {
			System.out.println("Right now is morning");
		}else if (time>=12 && time<=15) {
			System.out.println("Right no is afternoon");
		}else if (time>=16 && time<=20) {
			System.out.println("Right now is evening");
		}else if(time>=21 && time<=24) {
			System.out.println("Right now is night");
		}else {
			System.out.println("Not valid time entered");
		}
		
		System.out.println("===================================");
		
		String timeOfDay;
		if(time>=1 && time<=11) {
			timeOfDay="morning"; 
		}else if (time>=12 && time<=15) {
			timeOfDay="afternoon";
		}else if (time>=16 && time<=20) {
			timeOfDay="evening";
		}else if(time>=21 && time<=24) {
			timeOfDay="night";
		} else {
			timeOfDay="invalid";
		}
		System.out.println("right now is " + timeOfDay);
	}

}
