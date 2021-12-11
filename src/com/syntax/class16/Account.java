package com.syntax.class16;

public class Account {

	private String userName;
	private String password;
	private String name;
	private String adrress;
	private int age;
	private double accountBalance=100000;
	//to access private fields we should extend it and make the method
	//public and put restrictions.
	
	public void SetUserName(String accountuserName) {
		if (accountuserName.length()<16) {
			userName=accountuserName;
		}else {
			System.out.println("UserName of this length is not allowed");
		}
	}
	public void setPassword(String accountPass) {
		if (accountPass.length()<16) {
			password=accountPass;
		}else {
			System.out.println("password of this length is not allowed");
		}
	}
	public void getBalance(String accountuserName, String accountPassword) {
		 
		if (userName.equals(accountuserName)&& password.equals(accountPassword)) {
			System.out.println(accountBalance);
		}else {
			System.out.println("UserName or password is not correct");
		}
	}
}
