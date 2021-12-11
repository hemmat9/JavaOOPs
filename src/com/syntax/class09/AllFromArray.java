package com.syntax.class09;

public class AllFromArray {

	public static void main(String[] args) {
		
		int []num= {100,200,300,400,500};
		
		for (int i=0; i <num.length; i++) {
			System.out.print(num[i]+" ");
		}
		// to access all elements from an array we can use for each loop/advanced for loop/enhanced loop it only works with arrays.
		System.out.println("================================");
		for(int n:num) {
			
			System.out.print(n+" ");
		}
		
		System.out.println("======================");
		
		String[]color= {"Red","blue","white"};
		
		for (String col:color) {
			System.out.println(col);
		}
		
	
	
	
	}

}
