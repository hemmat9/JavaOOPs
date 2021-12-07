package com.syntax.class23.abstraction;

public class VehicleTester {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("123abc", "Sedan", "BMW", "X5");
        toyota.printVehicleCount();
        toyota.speed();
        toyota.start();
        toyota.drive();
        toyota.stop();

        //Vehicle toyota = new Toyota("12bc", "Sedan", "Corolla", "XLE");

    }
}
// we can not have final and abstract at the same time because they contradict each other
// final means complete and abstract means incomplete