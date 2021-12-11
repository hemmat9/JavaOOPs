package com.syntax.class10;

public class TwoDArrays {

	public static void main(String[] args) {
		// 2 Dimensional Arrays
		
		
		int [][] bigArray=new int [3][3];
		
		//adding elements inside first array or first row
		
		bigArray[0][0]=10;
		bigArray[0][1]=20;
		bigArray[0][2]=30;
		
		//adding elements inside second array or second row
		bigArray[1][0]=1;
		bigArray[1][1]=2;
		bigArray[1][2]=3;
		
		//adding elements inside third array or third row
		bigArray[2][0]=100;
		bigArray[2][1]=200;
		bigArray[2][2]=300;
		// how to access?
		
		System.out.println(bigArray[2][1]); // to access 200.
		
		System.out.println(bigArray.length);// returns how many 1d arrays it has or number of rows.
	}

}
