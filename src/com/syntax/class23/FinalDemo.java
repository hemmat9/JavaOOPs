package com.syntax.class23;

public class FinalDemo {//if we have a final keyword with class it can not be inherited

    private final String NAME="Farhad";//NAME SHOULD BE IN CAPITAL, NAMING CONVENTION
    protected final int AGE =20;
    public final double WEIGHT=30;
    final double HEIGHT=5.34;
    static final int NO_OF_LEGS=2;//
    String hairColor="Black";

    private /*final*/ void printName(){//FINAL METHODS DO NOT PARTICIPATE IN INHERITANCE, THERE FOR THERE IS NO NEED TO HAVE A FINAL KEYWORD WITH IT.
        System.out.println(NAME);//the best practice is to declare the access modifier first then "final" keyword

    }
    void printHairColor(){
        System.out.println(hairColor);
    }
    final void printAge(){//we can use final keyword with default modifier.
        System.out.println(AGE);
    }
    protected final void printHeight(){
        System.out.println(HEIGHT);
    }
    public final void printWeight(){
        System.out.println(WEIGHT);
    }

    public static /*final*/ void printNoOfLegs(){//we can redeclare a static method, but we can not override static method.
        System.out.println(NO_OF_LEGS);
        //System.out.println(WEIGHT); we can not use an instance field with static method.
    }

    //static final FinalDemo(){}//not allowed with constructors, it belongs to the class to initialize the instance fields, they don't participate in inheritance that is why not allowed.
}
class Child extends FinalDemo{
    public static void printNoOfLegs(){
        //System.out.println(WEIGHT); not allowed because its on instance field not static
        System.out.println("From Child"+NO_OF_LEGS);
    }
    }
 class Tester{
     public static void main(String[] args) {
         Child child = new Child();
         child.printHairColor();
         child.printNoOfLegs();
     }
}