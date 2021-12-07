package com.syntax.class18;

public class MultiClassConsDemoTest {
    public static void main(String[] args) {

        MultiClassConsDemo obj = new MultiClassConsDemo("String",12);
        new MultiClassConsDemo(12,"String");
        //new MultiClassConsDemo();
        new MultiClassConsDemo("String", 12, 200);

    }
}
