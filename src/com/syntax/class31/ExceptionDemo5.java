package com.syntax.class31;

import java.io.FileInputStream;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        System.out.println("Line 1");
        //System.out.println(10/0);
        try{
            System.out.println("Line 2");
            System.out.println(10/0);
            System.out.println("Line 3");
            int [] arr= new int [-5];
            System.out.println("Line 4");
            String name=null;
            System.out.println("Line 5");
            name.toLowerCase();
            System.out.println("Line 6");
            FileInputStream fileInputStream = new FileInputStream("afdadsf");
        }catch (ArithmeticException e){
            //e.printStackTrace();
            System.out.println("Line 7");

        }catch (NegativeArraySizeException e){
            //e.printStackTrace();
            System.out.println("Line 8");
        }catch (NullPointerException e){
           // e.printStackTrace();
            System.out.println("Line 9");
        }catch (Exception e){
           // e.printStackTrace();
            System.out.println("Line 10");
        }
        System.out.println("Lien 11");
    }
}
