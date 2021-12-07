package com.syntax.class24.interfaceDemo;

public /*abstract*/ interface Person {//it is required to use abstract keyword with interface because it is redundancy

    //private void eat();// not allowed
    //protected void eat(); //not allowed
    //public  void eat(); // all methods in interface is public and abstract by default
    //final void eat(); //final is also not allowed because of contradiction.

    //int age; //we can not have a field without a value because all the fields
    // in interface should be public static and final
    // which means they must have a value
    //int age =15; this is allowed

    void eat();
    void sleep();
}
interface Employee {
    void work();
}
interface SyntaxEmployee extends Employee, Person{
    void tech();
}
class SDETInstructor implements SyntaxEmployee {
    @Override
    public void eat(){
        System.out.println("Syntax Employee sleeping");
    }
    @Override
    public void sleep(){
        System.out.println("Syntax Employee sleeping");
    }
    @Override
    public void work(){
        System.out.println("Creating ne repls");
    }
    @Override
    public void tech(){
        System.out.println("Syntax Employee teaching");
    }
}
