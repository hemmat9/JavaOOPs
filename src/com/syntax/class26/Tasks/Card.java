package com.syntax.class26.Tasks;
//Create a Card class that will have implemented  and unimplemented methods and a constructor that will initialize credit card type.
// Create 3 subclasses of a Card card.
// Create 3 objects of different card and store them into LinkedList. Using for loop/advanced for loop/ iterator access all methods of the class.
public abstract class Card {
    abstract void interest ();
    String creditCardType;
    public void payment(){
        System.out.println("Payments are due at the beginning of every month");
        }
    Card (String creditCardType){
        }
    }
    class Visa extends Card{
    Visa (String creditCardType){
        super(creditCardType);
        this.creditCardType=creditCardType;
    }
    public void interest(){
        System.out.println(creditCardType+ " has 3% interest on late payments");
    }
        }
        class MasterCard extends Card{
    MasterCard(String creditCardType){
        super(creditCardType);
        this.creditCardType=creditCardType;
    }
    public void interest(){
        System.out.println(creditCardType+ " has 2.5% interest on late payments");
    }
        }
        class AmericanExpress extends Card{
    AmericanExpress(String creditCardType){
        super(creditCardType);
        this.creditCardType=creditCardType;
    }
    public void interest(){
        System.out.println(creditCardType +" has 2% interest on late payments");
    }
        }


