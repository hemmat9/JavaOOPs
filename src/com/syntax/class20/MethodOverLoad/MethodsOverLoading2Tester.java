package com.syntax.class20.MethodOverLoad;

public class MethodsOverLoading2Tester {
    public static void main(String[] args) {

        MethodOverLoading2.add(10,10);
        MethodOverLoading2.add(10,10.5);
        //MethodOverLoading2.add(10.5,10.5);
        int [] array={10,10,10,};
        //MethodOverLoading2.addA(array);

        MethodOverLoading2.add(10,10,10,10,10,10,10);
    }
}
