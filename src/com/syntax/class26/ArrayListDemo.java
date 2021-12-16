package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Fruit>fruits = new ArrayList<>();
        fruits.add(new Apple());
        fruits.add(new Orange());
        fruits.add(new Fruit());

        for (Fruit f: fruits){
            f.printName();
        }

    }

}
class Fruit{
    void printName(){
        System.out.println("I am a fruit");
    }
}
class Apple extends Fruit{
    void printName(){
        System.out.println("I am an Apple");
    }
}
class Orange extends Fruit{

    void printName() {
        System.out.println("I am an Orange");
    }
}
