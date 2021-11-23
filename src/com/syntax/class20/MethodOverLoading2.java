package com.syntax.class20;

public class MethodOverLoading2 {
    static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    static void add(int num1, double num2) {//if we have static fields then we should not create objects of it, so we can directly call the method
        System.out.println(num1 + num2);
    }

    static void add(int... arr) {//this method will take n numbers of the same data type and add them this method called var args we should have this method or array method we can not have both
        // this can handle all the add methods, but it gets the lowest priority if there is a method already exists.
        int sum = 0;
        for (int number : arr) {
            sum = sum + number;
        }
        System.out.println(sum);
    }

    static void add(int num1, int num2, int num3) {//Java calls the methods based on parameters
        System.out.println(num1 + num2 + num3);
    }

    static void add(double num1, double num2) {
        System.out.println(num1 + num2);
    }


    /*static void add(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum = sum + number;

        }
        System.out.println(sum);
    }*/
}


