package com.syntax.class24.interfaceDemo;

public class PersonTester {
    public static void main(String[] args) {

        Person person = new SDETInstructor();
        person.eat();
        person.sleep();
        //person.teach(); I can not access teach method because it is not a method of person
        //person.work(); I can not access teach method because it is not a method of person


        Employee employee = new SDETInstructor();
        employee.work();
        //employee.eat(); I can not access eat method it is not a method of employee

        SyntaxEmployee syntaxEmployee = new SDETInstructor();
        syntaxEmployee.tech();
        syntaxEmployee.eat();
        syntaxEmployee.sleep();
        syntaxEmployee.work();

        SDETInstructor sdetInstructor= new SDETInstructor();
        sdetInstructor.eat();
        sdetInstructor.sleep();
        sdetInstructor.tech();
        sdetInstructor.work();

    }
}
