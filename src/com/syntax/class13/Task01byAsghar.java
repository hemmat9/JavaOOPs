package com.syntax.class13;

public class Task01byAsghar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String password="Pass1234";
		String ConfirmPass="Pass1234";
		String UserName="Farhad";
		if (!(UserName.isEmpty()|| password.isEmpty())) {
			if (password.length()>=8) {
				if (!password.contains(UserName)) {
					if (password.equals(ConfirmPass)) {
						System.out.println("Your username and password has been created");
					} else {
						System.out.println("Passwords do not match");
					}
				}else {
					System.out.println("Password cannot contain username");
				}
			}else {
				System.out.println("Password is too short");
			}
		}else {
			System.out.println("Username and Password connot be empty");
		}
		
			
				
		
	}

}
