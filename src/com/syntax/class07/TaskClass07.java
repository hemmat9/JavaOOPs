package com.syntax.class07;

public class TaskClass07 {

	public static void main(String[] args) {
		/*
		 * Print numbers from 1 to 100 in 1 line with space
		 * 
		 * Print numbers from 100 to 1
		 * 
		 * Print even numbers from 20 to 100
		 * 
		 * Print only odd numbers from 100 to 1
		 */

		for (int a=1; a<=50; a++) {
			
			System.out.print(a+ " ");
		}
	System.out.println();
		for (int a =50; a>=1; a--) {
			System.out.print(a+" ");
			
		}
		System.out.println();
		for (int a=20; a<=100; a++) {
			if (a%2==0)
				System.out.print(a+ " ");
		}
		System.out.println();
		
		for (int a=100; a>=1; a--) {
			if (a%2!=0)
			System.out.print(a+ " ");
		}
}}