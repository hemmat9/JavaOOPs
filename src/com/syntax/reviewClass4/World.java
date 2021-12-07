package com.syntax.reviewClass4;

public class World {
    public static void main(String[] args) {
        MathTeacher math = new MathTeacher("Farhad", "Hemmat", 20000,"Math");//cannot be instantiated
        math.printInfo();
        Human.sleep();
        Human.eat();
        math.teach();
        math.getPaid();
        math.takeExam();

        //compile time polymorphism -- we achieve it through method overloading
        //(Static or early binding)
        math.speak("math");
        math.speak();

        /*Run Time Polymorphism can be achieved through the method overriding
        * (dynamic or late binding*/
        //casting of non primitives: Upcasting and Downcasting
        Teacher teacher =new MathTeacher("Jane", "Doe",40000, "Math");
        teacher.teach();
       // teacher.speak("Russian");can not access
        //compiler checks based on Reference Type (Teacher) Java executes based on Object Type (MathTeacher);
    }
}
