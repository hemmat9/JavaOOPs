package com.syntax.Practice;

public class A {
    //while, do while, for , enhanced for loop
    public static void main(String[] args) {

        int a =20;
        int b=10;

        a=a+b;//30
        b=a-b;//20
        a=a-b;
        System.out.println(a);
        System.out.println(b);

        System.out.println("==============================================");



       String x = "Hello";
       String y = "Syntax";

        x=x+y;//HelloSyntax
        y=y+x;//SyntaxHello
        x=x.substring(5,11);
        y=y.substring(6,11);
        System.out.println(x);
        System.out.println(y);

        //What is a prime number?
//      Bigger than 1, not dividable by any number, but by itself.
        //The first ten primes are 2, 3, 5, 7, 11, 13, 17, 19, 23, 29.



    }
}
