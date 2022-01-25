package com.syntax.class31;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        String path ="Files/Farhad.properties";

        File file = new File(path);
       /* if(file.exists()){
            System.out.println("Yes file exists");
            FileInputStream fileInputStream =new FileInputStream(path);
        } else{
            System.out.println("File is not present at this path");
        }*/

        try {
            System.out.println("The file is present I should not get any error");
            FileInputStream fileInputStream = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            System.out.println("File is not present at that location");
        }

    }
}
