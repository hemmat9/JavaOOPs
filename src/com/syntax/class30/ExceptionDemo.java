package com.syntax.class30;

public class ExceptionDemo {

    public static void main(String[] args) {

        System.out.println("Important lines of code");
        System.out.println("Important lines of code");
        try{
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println("Dividing by Zero is not possible in Java");
        }

        System.out.println("Important lines of code");
        System.out.println("Important lines of code");

    }

}
