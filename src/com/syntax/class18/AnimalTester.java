package com.syntax.class18;

public class AnimalTester {
    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.name="Bobby";
        dog.breed="Bulldog";
        dog.bark();
        dog.eat();
        dog.sleep();

        Cat cat = new Cat();
        cat.name="Lexy";
        cat.meow();
        System.out.println(dog.name);

    }
}
