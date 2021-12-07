package com.syntax.class19;

public class Pet {
    String name;
    String breed;
    String color;
    int age;

    Pet (String name, String breed, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }
    void printInfo(){
        System.out.println(name+breed+color+age);
    }
}
    class Dog extends Pet {

    Dog (String name, String breed, String color, int age) {//constructors do not participate in inheritance
            super(name, breed, color, age);  //super is used to call the constructors of the parent class
        }

        void print() {
            System.out.println(name+" "+breed+" "+color+" "+age);
        }
    }

    class Cat extends Pet {
        Cat(String name, String breed, String color, int age) {
            super(name, breed, color, age);
        }

        void printInfo() {
            System.out.println(name+" "+breed+" "+color+" "+age);
        }
        void play(){
            System.out.println(name+ " is playing");
        }
    }
    class Cow extends Pet{
    Cow (String name, String breed, String color, int age){
        super(name, breed, color, age);
    }
    }
