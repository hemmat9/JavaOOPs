package com.syntax.class22HomeWork;
//Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
//Define common behavior within and some fields in parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Create objects of child classes and store them into array. Loop through each object and execute available methods.
public class Computer {

String model;
Computer (String model){
    this.model=model;
}
void operatingSystem(){
    System.out.println(model+" Has operating system");
}
void playVideo(){
    System.out.println("Can play videos");
}
}
class Apple extends Computer{
    Apple (String model){
        super(model);
    }
    @Override
    void operatingSystem(){
        System.out.println(model+" has MacOS");
    }
    void printCost(){
        System.out.println(model + " Cost about $1300");
    }
}
class Lenovo extends Computer{
    Lenovo (String model){
        super(model);
    }
    @Override
    void operatingSystem(){
        System.out.println(model+ " has Windows");
    }
    void printCustomerService(){
        System.out.println(model + " has the best customer services");
    }
}
class HP extends Computer{
    HP (String model){
        super(model);
    }
    @Override
    void operatingSystem(){
        System.out.println(model + " has Windows");
    }
    void printGraphic(){
        System.out.println(model + " has the best graphic system");
    }
}
class Dell extends Computer{
    Dell (String model){
        super (model);
    }
    void operatingSystem(){
        System.out.println(model + " has windows");
    }
    void services(){
        System.out.println("has best services");
    }
}