package com.syntax.practice;

public class Wrapper {
    public static void main(String[] args) {
        //byte, short, long, float, int, double, boolean, char//primitive data types
        //Byte, Short, Long, Float, Integer, Double, Boolean, Character,// now we can use them as an Object

       Integer i = new Integer(10);//boxing
       System.out.println(i);
       Integer a=10;//AutoBoxing
        System.out.println(a);

        int i1= i.valueOf(i);//unboxing
        System.out.println(i1);

        int b=a;
        System.out.println(b);

    }
}
