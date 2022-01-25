package com.syntax.class31.HowToCreateExceptions;

import com.syntax.class31.HowToCreateExceptions.Account;
import com.syntax.class31.HowToCreateExceptions.InsufficientBalanceException;

public class ExceptionDemo11 {
    public static void main(String[] args) {
        try {
            Account.withDraw(-10);
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        }
    }
}
