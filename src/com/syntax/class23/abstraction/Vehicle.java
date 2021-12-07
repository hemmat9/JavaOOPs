package com.syntax.class23.abstraction;

abstract public class Vehicle {

    //abstract String vin_number();// we can not have abstract with instance fields because they don't have any body
    String vinNumber;
    static int totalVehicle;

    //abstract Vehicle(){} abstract is not allowed with constructors


    Vehicle (String vinNumber){
        totalVehicle++;//we can access the static fields inside a constructor because they are universal.
        this.vinNumber=vinNumber;
        System.out.println("Grandpas constructor is called");
    }
    public void printVehicleCount(){
        System.out.println(totalVehicle+ " Vehicles created");
    }
    public void drive(){
        System.out.println(" Vehicle is driving");
    }
    public void stop(){
        System.out.println(" Vehicle stopping");
    }
    public abstract void start();
}
abstract class Car extends Vehicle{
    String carType;
    Car (String carType, String vinNumber){
        super (vinNumber);
        this.carType=carType;
        System.out.println("Parent constructor is called");
    }
    @Override
    public void drive(){
        System.out.println(" Car is driving");
    }
    public abstract void speed();

}
class BMW extends Car{
    String make;
    String model;
    BMW(String vinNumber, String carType, String make, String model){
        super (vinNumber, carType);
        this.make=make;
        this.model=model;
        System.out.println("BMW constructor");
    }
    public void speed(){
        System.out.println(" BMW can run 300km/H");
    }
    public void start(){
        System.out.println("BMW can start using remote");
    }
}
class Toyota extends Car{
    String model;
    String make;
    Toyota (String vinNumber, String carType, String model, String make){
        super(vinNumber, carType);
        this.make=make;
        this.model=model;
    }
    public void speed (){
        System.out.println("Toyota can run 200km/hr");
    }
    public void start(){
        System.out.println("Toyota can start using keys");
    }
    void displayInfo(){
        System.out.println("we build "+ make+ " model "+ model + " "+ carType+ " "+ vinNumber);
    }
}
