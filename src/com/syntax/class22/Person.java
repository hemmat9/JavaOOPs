package com.syntax.class22;

public class Person {
    String name;

    Person(String name) {
        this.name = name;

    }

    void eat() {
        System.out.println(name + " eating");
    }

    void performDailyTask() {
        System.out.println("Eat sleep repeat");
    }

}

class Employee extends Person {
    Employee(String name) {// we must pass the constructor and use the super keyword to refer it to the super class.
        super(name);

    }

    void performDailyTask() {
        System.out.println("Working all the daay in office and reading emails at night");
    }

}

class Student extends Person {
    Student(String name) {
        super(name);
    }

    void performDailyTask() {
        System.out.println("Attending the classes at day reading at night");
    }
}

class Teacher extends Person {
    Teacher(String name) {
        super(name);
    }

    void performDailyTask() {
        System.out.println("Giving homework a day party at night");
    }
    void designClasses(){
        System.out.println("Create repls and design new classes");
    }
}