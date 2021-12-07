package com.syntax.practice;

public class Overriding {

    void sleeping(String name, int age){
        System.out.println("Farhad likes to sleep 6 hours a day");
    }

}

class Son extends Overriding{

    @Override
    void sleeping(String name, int age){
        System.out.println("Son likes to sleep 8 hours a day");
    }
}


