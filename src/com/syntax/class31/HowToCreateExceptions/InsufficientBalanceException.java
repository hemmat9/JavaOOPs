package com.syntax.class31.HowToCreateExceptions;

public class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message){
        super(message);
    }
}
