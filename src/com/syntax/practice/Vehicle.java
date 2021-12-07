package com.syntax.practice;

public class Vehicle {
    String name;
    String model;
    String make;
    String vinNum;
    String color;
    double price;


    void printInfo (){
        System.out.println(name+" "+model+" "+make+" "+vinNum+" "+color+" "+price);
    }
}
class Tesla extends Vehicle{
@Override
    void printInfo (){//overriding
        System.out.println(name+" "+model+" "+make+" "+vinNum);
    }


    void carInfo(){
        System.out.println(name+ " is an electric car");
    }

}
class Toyota extends Vehicle{

    int year=2022;
    void printInfo (){//overload
        System.out.println(name+" "+model+" "+make+" "+vinNum+" "+color+" "+price+" "+year);
    }

    void companyInfo(){
        System.out.println("Toyota is the most famous car company in the world");
    }
}