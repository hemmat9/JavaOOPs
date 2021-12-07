package com.syntax.practice;

public class Doctor {//parent, super, base
    String name;//instance variable
    String lastName;
    String speciality;
    double salary;
    static String hospital="John Muir";//static variable


    void treatPatient(){//method
        System.out.println(name+ " treats patients in the Hospital "+hospital);
    }
    void getsPaid(){
        System.out.println(name+ " gets paid "+salary);
    }
    void printInfo(){
        System.out.println(name+" "+ lastName+" "+speciality+" "+salary+" "+hospital);
    }
}
