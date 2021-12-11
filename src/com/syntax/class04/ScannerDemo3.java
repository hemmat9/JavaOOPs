package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo3 {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in); 
		System.out.println("Please enter any sentence");
		String entireLine = scanner.nextLine();
		System.out.println(entireLine);
		
	}

}
