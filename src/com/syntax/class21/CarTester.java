package com.syntax.class21;

public class CarTester {
    public static void main(String[] args) {
       /*BMW bmw = new BMW();
       bmw.start();
       bmw.park();
       bmw.stop();

       Tesla tesla = new Tesla();
       tesla.park();
       tesla.stop();
       tesla.start();

       Toyota toyota = new Toyota();
       toyota.start();
       toyota.park();
       toyota.stop();*/

        Car[] cars={new BMW(), new Tesla(), new Toyota()};
        for (Car car:cars){
            car.start();
            car.park();
            car.stop();
        }
    }
}
