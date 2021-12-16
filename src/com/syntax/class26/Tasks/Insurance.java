package com.syntax.class26.Tasks;
//Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
// Create 3 subclasses Car, Pet, Health. Car class has its own attribute as carModel and Class Pet has petType attribute.
// Create 3 objects of the sub-classes and store them in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class.
public abstract class Insurance {

    String insuranceName;
    public Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }
    public abstract void getQuote();
    public abstract void cancelInsurance();
}
class Car extends Insurance {
    String carModel;
    Car(String insuranceName, String carModel){
        super(insuranceName);
        this.carModel=carModel;
    }

    public void getQuote(){
        System.out.println("insurance Quotation from "+insuranceName+" for car model " +carModel );
    }
    public void cancelInsurance(){
        System.out.println("Cancel Insurance from "+ insuranceName+ "for car "+ carModel);
    }
}
class Pet extends Insurance{
    String petType;
    Pet(String insuranceName,  String petType){
        super(insuranceName);
        this.petType=petType;
    }

    public void getQuote() {
        System.out.println("insurance Quotation for "+petType);
    }
   public void cancelInsurance() {
        System.out.println("Cancel Insurance for "+petType);
    }
}
class Health extends Insurance{
    Health(String insuranceName){
        super(insuranceName);
    }
    @Override
    public void getQuote() {
        System.out.println("Quotation for health insurance "+insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancel health Insurance");
    }
}
