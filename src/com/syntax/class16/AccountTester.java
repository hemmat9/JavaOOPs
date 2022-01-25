package com.syntax.class16;

public class AccountTester {

	public static void main(String[] args) {
		
		Account account1= new Account();
		
		//account1.balance=123456;//not allowed because private we can access it by making it public
		//it defines some if conditions for it.
		account1.SetUserName("Farhad");
		account1.setPassword("Farhad123");
		account1.getBalance("Farhad", "Farhad123");
	}

}
