package com.syntax.class18HomeWork;
//Write a Java program called Teacher.  Identify features and behaviour of that Class.
// Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
// that would have it their own features and behaviour. Test all 4 classes
public class Teacher {

    String title;
    String name;
    String subject;
    double salary;
    int age;

    void teach() {
        System.out.println(name + " teaching ");
    }

    void help() {
        System.out.println(name + " helping students");
    }

    void eat() {
        System.out.println(name + " is eating");
    }
}