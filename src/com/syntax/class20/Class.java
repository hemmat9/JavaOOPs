package com.syntax.class20;

public class Class {

    private void method() {
        System.out.println("void method");
    }

    private int method(int number) {
        System.out.println(number*8);
        return number;
    }

    private int method(String str) {
        System.out.println(str);
        return 5;
    }





    public static void main(String[] args) {
        Class task4 = new Class();
        task4.method();
        task4.method("4");
        task4.method(4);
    }
}
