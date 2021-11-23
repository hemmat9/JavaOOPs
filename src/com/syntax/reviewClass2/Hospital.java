package com.syntax.reviewClass2;

import com.syntax.reviewClass3.Doctor;

public class Hospital {

    public static void main(String[] args) {
        Doctor d1 = new Doctor("Farhad", "Hemmat", "Neurologist");
        d1.printInfo();//can access only public members in different package
        System.out.println(d1.name);
        System.out.println(d1.lastName);

        Doctor.hospital="ABC Hospital";
    }
}
