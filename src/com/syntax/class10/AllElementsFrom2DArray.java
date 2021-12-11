package com.syntax.class10;

public class AllElementsFrom2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] groceries= {
				
				// 2d array is array of arrays
				
				{"banana", "apple", "mango"},
				{"potato", "tomato"},
				{"milk", "cheese", "ayram", "yogurt"}	
				
				};
		
		for (String [] grocery :groceries) {
			for (String g:grocery) {
				
				System.out.print(g+" ");
			}
			
			System.out.println();
			
		}
	}

}
