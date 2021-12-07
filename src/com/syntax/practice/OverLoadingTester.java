package com.syntax.practice;

public class OverLoadingTester {
    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        overloading.add(20,20);
        overloading.add(10.5,10.5);
        overloading.add(10.5, 1.5f);
        overloading.add(10,10,10);
        overloading.add(10,10.5);

    }
}
