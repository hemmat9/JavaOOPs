package com.syntax.Practice;

public class Vehicle {
    public void name(){
        System.out.println("Vehicle class method");
    }
}
class Car extends Vehicle{
    public void name(){
        System.out.println("Car class method");
    }
}
class BMW extends Vehicle{
    public void name (){
        System.out.println("BMW class Method");
    }
}
