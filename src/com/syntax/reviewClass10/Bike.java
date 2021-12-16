package com.syntax.reviewClass10;

public class Bike {
    static final int SPEED_LIMIT=100;// we can't change its value, but it can be inherited. And can be overridden

   final int maxSeatingCapacity; // if final variable is not initialized then it must be within a constructor.
    Bike(int maxSeatingCapacity){
        this.maxSeatingCapacity=maxSeatingCapacity;
    }
    static void run(){
        System.out.println("Honda Bike can run "+SPEED_LIMIT+" M/h");//it is inherited here.
    }
}
class HondaBike extends Bike{
    HondaBike(int maxSeatingCapacity){
        super(maxSeatingCapacity);
    }
    //SPEED_LIMIT=150; we can not change the value of the final variable.
    //static int SPEED_LIMIT=200;//it is overridden we can also override it without final keyword, we can use static modifier here, and also all access modifiers.
    static void run(){
       // int SPEED_LIMIT=300;//local variables are giving the priority, then instance variable, then the superclass.
        System.out.println("Honda Bike can run "+SPEED_LIMIT+" M/h");//it is inherited here.
    }
}
class Main{
public static void main(String[]args){

    HondaBike hondaBike = new HondaBike(2);
    hondaBike.run();

        }
        }
