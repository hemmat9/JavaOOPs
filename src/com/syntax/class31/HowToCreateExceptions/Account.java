package com.syntax.class31.HowToCreateExceptions;

import com.syntax.class31.HowToCreateExceptions.InsufficientBalanceException;

public class Account {
    public static void withDraw(double amount) throws InsufficientBalanceException {


        if(amount<0){

            throw new InsufficientBalanceException("Amount can't be negative");

        }
    }
}

