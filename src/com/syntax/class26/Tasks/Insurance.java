package com.syntax.class26.Tasks;
//Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
// Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
// Create 3 objects of the sub classes and store them in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class.
public abstract class Insurance {

    String insuranceName;
    abstract void getQuote();
    abstract void cancelInsurance();
}
class Car extends Insurance {
    String carModel="Camry";
    void getQuote(){
        System.out.println("insurance Quotation for "+ carModel );
    }
    void cancelInsurance(){
        System.out.println("Cancel Insurance for car "+ carModel);
    }
}
class Pet extends Insurance{
    String petType="Dog";

    void getQuote() {
        System.out.println("insurance Quotation for "+petType);
    }
    void cancelInsurance() {
        System.out.println("Cancel Insurance for "+petType);
    }
}
class Health extends Insurance{
    @Override
    void getQuote() {
        System.out.println("Quotation for health insurance");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Cancel health Insurance");
    }
}
