package com.syntax.class20HomeWork;
//Create a class CreditCard and define variable balance and interest.
// Create an instance method that will calculate interest based on the given balance.
//Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
//Call the method by creating an object of each of the three classes.
public class CreditCard {

    public void calculateInterest(double balance, double interest){
        balance=balance;
        interest=interest;
        System.out.println("Visa interest rate = "+ (balance/100)*(interest));

    }
}
class Visa extends CreditCard{

}
class AX extends CreditCard{
    @Override
    public void calculateInterest(double balance, double interest){
        balance=balance;
        interest=interest;
        if (balance>5000){
            System.out.println("You will pay higher interest rate");
        }else {
            System.out.println("AX interest rate = "+(balance/100)*(interest));
        }


    }
}
