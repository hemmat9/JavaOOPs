package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo10 {
    public static void main(String[] args) {
        try {

        readFile();
    }catch (FileNotFoundException e){
            System.out.println("I know better how to handle this");
        }
    }
    public static void readFile() throws FileNotFoundException {//throws key word is used to pass the Exception handling to someone who calls this method.
        FileInputStream fileInputStream = new FileInputStream("fdf");
    }
}
