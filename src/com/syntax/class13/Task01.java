package com.syntax.class13;

public class Task01 {

	public static void main(String[] args) {
		// Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.

		String Username= "farhad";
		String Password= "far12345";
		String cPassword ="far12345";
		
		if (Username.isEmpty() || Password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		} else if (Password.length()<8) {
			System.out.println("Password is too short");
		}else if (Password.contains(Username)) {
			System.out.println("Password cannot contain username");
		}else if (!(Password==cPassword)) {
			System.out.println("Passwords do not match ");
		} else {
			System.out.println("Your username and password has been created");
		}
	}

}
