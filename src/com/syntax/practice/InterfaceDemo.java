package com.syntax.practice;

public  interface InterfaceDemo {

    int age=16;
    String name="Farid";
    //String model;

    void speak();
    void read();
    void walk();
}
interface computer extends InterfaceDemo{
    void compute ();
}

class Sharif implements InterfaceDemo,computer{

   public void speak(){
        System.out.println("Sharif speaks");
    }
   public void read(){
        System.out.println("Sharif Reads the book everyday");
    }
   public void walk(){
        System.out.println("Sharif walks everyday");
    }
    public void compute(){
        System.out.println("Sharif's computer computes");
    }
}
