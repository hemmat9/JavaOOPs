package com.syntax.class21;

public class Parent {

     void method (int num){
        System.out.println("from Parent");

    }
}
class Child extends Parent {
    @Override
    void method(int num) {//this is overriding
        System.out.println("from child");

    }

    void method(String num) {//this is overloading
        System.out.println("from child");
    }

    static class Tester {

        public static void main(String[] args) {
            Child child = new Child();
            child.method(10);

        }

    }
}