package com.syntax.practice;

public class InterfaceDemoTester {
    public static void main(String[] args) {
        InterfaceDemo demo = new Sharif();
        demo.read();
        demo.speak();
        demo.walk();
        ((Sharif) demo).compute();
    }
}
