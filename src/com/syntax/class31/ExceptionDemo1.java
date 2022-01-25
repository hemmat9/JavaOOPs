package com.syntax.class31;

public class ExceptionDemo1 {

    public static void main(String[] args) {

        String name= null;
        System.out.println("hello");
        try{
        double num1=10;
        double num2=0;
        System.out.println(num1/num2);
        System.out.println(name.length());

    }catch (NullPointerException e){
            System.out.println(e);
    }catch (ArithmeticException b){
            System.out.println("we can not divide by Zero");
    }
        System.out.println("Welcome");

    }
}
