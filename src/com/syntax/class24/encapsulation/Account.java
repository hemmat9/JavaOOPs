package com.syntax.class24.encapsulation;

public class Account {
    private String name;
    private String userName;
    private String password;
    private double balance=100000;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 15) {
            this.name = name;
        }else{
            System.out.println("name of this length is no allowed");
        }
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance>0){
            this.balance = balance;
        }else {
            System.out.println("Negative value is not allowed");
        }

    }
}
