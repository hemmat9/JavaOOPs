package com.syntax.class20HomeWork;

public class CreditCardTester {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(1000);
        creditCard.calculateInterest();

        AX ax = new AX(2000);
        ax.calculateInterest();

        Visa visa = new Visa(5000);
        visa.calculateInterest();

    }
}
