package com.syntax.practice;

public class DoctorTester {
    public static void main(String[] args) {

        Dentist dentist = new Dentist();
        dentist.name="Sharif";
        dentist.lastName="Khaksar";
        dentist.salary=200000;
        dentist.speciality="Dentist";
        dentist.eat();
        dentist.getsPaid();
        dentist.treatPatient();
        dentist.printInfo();


        Cardialogist cardialogist = new Cardialogist();
        cardialogist.name="Farhad";
        cardialogist.lastName="Hemmat";
        cardialogist.salary=200000;
        cardialogist.speciality="Cardialogist";
        cardialogist.sleep();
        cardialogist.getsPaid();
        cardialogist.treatPatient();
        cardialogist.printInfo();



    }
}
