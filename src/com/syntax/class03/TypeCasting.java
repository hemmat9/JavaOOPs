package com.syntax.class03;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double number=10.55; //define
		int number2=2;//define
		System.out.println(number);
		//byte-128-,+127, short, integer, long, float0.0, double 00.00
		//Type casting 1:implicit 2:explicit
		//Implicit: when a small number is assigned for a bigger variable.
		//Explicit: when a big number is assigned for a smaller variable.		
		
		number2=(int)number;// assign // because the range of integer is smaller than double that is why we should type (int) infront of it.
		System.out.println(number2);
		
		float a = 11.52f;//define
		int b = 2;//define
		
		b=(int)a;//assign
		System.out.println(b);
		
		int c = 100;//define
		double d = 55.5;//define
		d=(double)c;//assign
		System.out.println(d);
		
				
		double N1=10000.15555;
		int N2=15;
		N2=(int)N1;
		System.out.println(N2);
		
		
		int number3=10;
		double number4=number3; // because the range of double is wider than integer.
		System.out.println(number4);
		
		int number5=1000;
		byte number6=(byte)number5;
		
		System.out.println(number6);
		
		double num=66.66;
		int nub1=(int)num;
		System.out.println(nub1);
		
	}

}
