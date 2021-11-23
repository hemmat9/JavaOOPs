package com.syntax.reviewClass3;

public class DoctorsOffice {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("John", "Dow", "Dentist");
        System.out.println(doctor1.name);
        System.out.println(doctor1.lastName);
        System.out.println(doctor1.speciality);
        System.out.println(doctor1.salary);
        //System.out.println(doctor1.ssn); CE: The field Doctor.ssn is private only visibal within the same class

        doctor1.printInfo();
        doctor1.treatPatient("Farhad");
        doctor1.work();
       //doctor1.getPaid(); it is not available because the field is private


       /* Doctor doctor2 = new Doctor("Jane", "Smith", "Cardiologist", 200000);
       * */







    }
}
