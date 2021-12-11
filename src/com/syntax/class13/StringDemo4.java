package com.syntax.class13;

public class StringDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="This is Batch 11. Batch 11 is great";
		String [] arr= str.split("( )");// it splits the sentence where ever is a space . if say "[.]" it will split it from (.)
		
		for (String word:arr) {
			System.out.println(word);
		}
	
		
		String str2="I love Java";
		String[]arr2=str2.split("( )");
		
		for (String word2:arr2) {
		
		System.out.println(word2);

}
}
}