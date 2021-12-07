package com.syntax.class24.encapsulation;

public class AccountTester {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Farhad");
        System.out.println(account.getName());
        account.setPassword("Farhad123");
        System.out.println(account.getPassword());
        account.setUserName("Hemmat9");
        System.out.println(account.getUserName());
        account.setBalance(10000);
        System.out.println(account.getBalance());
    }
}
