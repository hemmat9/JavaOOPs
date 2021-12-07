package com.syntax.class22;

public class FatherTester {
    public static void main(String[] args) {

        Father son = new Son("Sharif");
        //Son father = new Father("SharifsFather"); not allowed

        //Son sharif=(Son)son; loss of data
        //Son2 Sharif=(Son2)son; not allowed
    }
}
