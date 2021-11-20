package com.syntax.class20HomeWork;

public class CreditCardTester {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.calculateInterest(1000,5);

        Visa visa  = new Visa();
        visa.calculateInterest(1000,5);

        AX ax = new AX();
        ax.calculateInterest(6000,5);



    }



}
