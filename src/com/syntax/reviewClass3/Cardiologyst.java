package com.syntax.reviewClass3;

public class Cardiologyst extends Doctor{

    public Cardiologyst(String name, String lastName, String speciality){
        super(name, lastName, speciality);

    }

    public static void main(String[] args) {
        Cardiologyst c = new Cardiologyst("Farhad", "Hemmat", "Cardiologist");

        c.printInfo();
        c.treatPatient("Sharif");
        c.work();
        //c.haveCertificate(); don't have access to methods from another child class
    }

    }

