package com.syntax.class20;

public class Class {

    private void method() {
        System.out.println("void method");
    }

    private int method(int number) {
        System.out.println(number*8);
        return number;
    }

    private double method(double num) {
        System.out.println(num);
        return num*8;
    }





    public static void main(String[] args) {
        Class task4 = new Class();
        task4.method();
        task4.method(4);
    }
}
