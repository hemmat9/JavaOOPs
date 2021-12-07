package com.syntax.practice;

public class VehicleTester {
    public static void main(String[] args) {

    Tesla tesla = new Tesla();
    tesla.name="Tesla";
    tesla.color="White";
    tesla.make="American";
    tesla.vinNum="1235adf";
    tesla.price=60000;
    tesla.model="Model X";

        tesla.printInfo();
        tesla.carInfo();


        Toyota toyota = new Toyota();
        toyota.printInfo();
        toyota.companyInfo();
    }
}