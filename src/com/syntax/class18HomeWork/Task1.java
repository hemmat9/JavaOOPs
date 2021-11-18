package com.syntax.class18HomeWork;

public class Task1 {

    public static void main(String[] args) {
        C obj = new C();

    }

}

class A {//this is how we can make multiple classes in the same editor

    public A() {//this is a constructor
        System.out.println("A");
    }
}

class B extends A {

    public B() {//this is a constructor
        System.out.println("B");
    }
}

class C extends B {
    public C() {// this is a constructor
        System.out.println("C");
    }
}