package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo2 {
    public static void main(String[] args) {


        try {
            Thread.sleep(2000);//called checked exception java makes as to try/catch or throw and exception to the main method, these can't be avoided by any coding
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("Farad");//called checked exception java makes as to try/catch or throw and exception to the main method
        } catch (FileNotFoundException e) {
            System.out.println("Something went wrong");
        }

        int a =10;
        int b = 0;
        if(b!=0){
            System.out.println(a/b);//these are called unchecked exceptions
        }else{
            System.out.println("divide by zero is not available in Java");
        }
        String name=null;
        if(name!=null){
            System.out.println(name.length());
        }else {
            System.out.println("Name variable is null");
        }

    }
}
