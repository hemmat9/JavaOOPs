package com.syntax.class13;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name = new String ("Farhad");
		String name1="Farhad";
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		System.out.println(name.concat(name1));// not recommended to use. it is prefarred to use plus (+) methode
	}

}
