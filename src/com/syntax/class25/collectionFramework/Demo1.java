package com.syntax.class25.collectionFramework;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        /*Limitation of arrays
        * 1)Arrays are fixed in size
         */
        String name ="Farhad";
        String [] names= {"Farhad", "Sharif"};
       // names[2]="Mohammad"; can not do it runtime error.
       // System.out.println(names[1]);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }




        ArrayList<String> listOfName = new ArrayList<>();
        listOfName.add("Farhad");
        listOfName.add("Sharif");
        listOfName.add("Yusuf");
        System.out.println(listOfName.size());
        listOfName.remove("Sharif");
        System.out.println(listOfName.size());
    }
}
