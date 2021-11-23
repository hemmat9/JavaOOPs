package com.syntax.class20;

public class ParentTester {
    public static void main(String[] args) {
        Child child = new Child();
        child.getMarried();
        child.printName();
        //private methods can not be overridden but can be overloaded.
    }
}
