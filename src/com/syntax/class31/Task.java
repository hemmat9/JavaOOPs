package com.syntax.class31;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Please enter a number");
            int number= scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Only numbers are allowed please try again");
        }

    }
}
