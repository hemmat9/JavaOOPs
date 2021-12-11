package com.syntax.class10;

public class AllElementsFrom2DArrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] numbers= {
				
				{100, 200, 300},
				{9, 8, 7}
				
		};
		
		System.out.println("size of 2D array= "+numbers.length);
		System.out.println(numbers[1][1]);//8
		
		// get all elements
		
		for (int[]num:numbers) {
			
			for (int n:num) {
				
				System.out.print(n+ " ");
			}
			
			System.out.println();
		}
		System.out.println("get all elements using regular for loop");
		for (int i =0; i<numbers.length; i++) {
			for (int j=0; j<numbers[i].length; j++) {
				
				int elements = numbers[i][j];
				System.out.print(elements+" ");
			}
			System.out.println();
		}
			
	}

}
