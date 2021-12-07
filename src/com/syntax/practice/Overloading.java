package com.syntax.practice;

public class Overloading {
// method overloading
// in method overloading we have the same names for out methods, but we must have different parameters. for overriding we must have same parameters
// for overloading we don't need inheritance, but for overriding we need inheritance
    public void add (int a , int b){
        System.out.println(a + b);
    }

    public void add (int a , int b, int c){
        System.out.println(a+b+c);
    }
    public void add (double a, double b){
        System.out.println(a+b);
    }
    public void add (int a, double b){
        System.out.println(a + b);
    }
    public void add(double b , int a){
        System.out.println(b+a);
    }
    public void add (double a , float b){
        System.out.println(a + b);
    }


    }


