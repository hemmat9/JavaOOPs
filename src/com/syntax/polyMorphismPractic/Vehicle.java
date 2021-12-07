package com.syntax.polyMorphismPractic;

public class Vehicle {

    public void start(){
        System.out.println("Starting the Vehicle");
    }
    public void maxSpeed(){
        System.out.println("Vehicle max speed is 150Miles");
    }
    public void stop(){
        System.out.println("stopping the vehicle");
    }
}
class Tesla extends Vehicle{
    @Override
    public void start(){
        System.out.println("Use mobile app to start the car");
    }
    @Override
    public void maxSpeed(){
        System.out.println("Tesla max speed is 220Miles");
    }
    @Override
    public void stop(){
        System.out.println("Tesla uses sensors to stop the car");
    }
    public void gas(){
        System.out.println("Tesla is an electric car does not use gas");
    }
}
class Toyota extends Vehicle{
    @Override
    public void start(){
        System.out.println("Use key to start the car");
    }
    @Override
    public void maxSpeed(){
        System.out.println("Toyota max speed is 120Miles");
    }
    @Override
    public void stop(){
        System.out.println("Toyota uses brake paddle to stop the car");
    }
    public void gas(){
        System.out.println("Toyota uses gas");
    }
}
