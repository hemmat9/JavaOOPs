package com.syntax.class28.Tasks;

public class Person {
    private String name;
    private String lastName;
    private int age;
    private double salary;

    Person(String name, String lastName, int age, double salary) {
        this.name=name;
        this.lastName=lastName;
        this.age=age;
        this.salary=salary;
    }

    public String printUserDetails(){
       return  "Name: "+name+" Last Name: "+ lastName+" Age: "+ age+" Salary: "+ salary;
    }

}
