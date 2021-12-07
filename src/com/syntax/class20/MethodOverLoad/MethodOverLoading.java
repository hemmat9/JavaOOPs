package com.syntax.class20.MethodOverLoad;

public class MethodOverLoading {
    static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    static void addIntDouble(int num1, double num2) {//if we have static fields then we should not create objects of it, so we can directly call the method
        System.out.println(num1 + num2);
    }


    static void addAddInt(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }

    static void addDouble(double num1, double num2) {
        System.out.println(num1 + num2);
    }
    static void multiNumber (int num1, int num2){
        System.out.println(num1 * num2);
    }
    static void multi3Numbers(int num1, int num2 , int num3){
        System.out.println(num1*num2*num3);
    }

    static void addArray (int[] array) {
        int sum = 0;
        for (int number : array) {
            sum = sum + number;

        }
        System.out.println(sum);
    }

}
