package com.syntax.reviewClass2;
import com.syntax.reviewClass3.Doctor;


public class Dentist extends Doctor {

    String certificate;
    String office;

    public Dentist(String name, String lastName, String speciality) {
        super(name, lastName, speciality);
    }
    public Dentist(String name, String lastName, String speciality, String certificate, String office){
        super(name, lastName, speciality);//super must be the first line
        this.certificate=certificate;
        this.office=office;

    }
    public void haveCertificate(){
        System.out.println(name + " has a dentist certificate");
    }
    //overLoad: when we have 2 method with same class
    //to overload (method signature must be different (name and parameter)
    //1- change the number of the parameters
    //2- change the type of parameters
    //3- change the sequence of parameter
    public void haveOffice(){
        System.out.println(name +" has 1 office ");
    }
    public void haveOffice(String state){
        System.out.println(name+ " has second office in "+ state);
    }



    public static void main(String[] args) {

        Dentist doe = new Dentist("Farhad", "Hemmat", "Dentist");
        doe.printInfo();
        doe.treatPatient("Ghafoor");//protected available because dentist is subclass of doctor
        //doe.work(); not accessible coz it is default and this class is made outside of parent package
        doe.think();
        doe.haveCertificate();
        doe.haveOffice("VA");
    }
}
