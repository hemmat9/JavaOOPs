package com.syntax.class20.class20HomeWork;
//Create a class CreditCard and define variable balance and interest.
// Create an instance method that will calculate interest based on the given balance.
//Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
//Call the method by creating an object of each of the three classes.
public class CreditCard {

    double balance;
    double interest;
    CreditCard(double balance){
        this.balance=balance;
    }
    void calculateInterest(){
       interest=balance*0.15;
        System.out.println("Interest = "+ interest);
        System.out.println("balance = " +balance);

    }
}
class AX extends CreditCard{

    AX(double balance) {
        super(balance);
    }
    @Override
    void calculateInterest(){
        interest=balance*0.05;
        System.out.println("Interest = "+ interest);

    }
}
class Visa extends CreditCard{

    Visa(double balance) {
        super(balance);
    }

}