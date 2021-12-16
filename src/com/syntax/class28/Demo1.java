package com.syntax.class28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        int[] numbers={10,20,10,50,100};//things are stored based on the indexes
        //hard to search have to go through all the elements in worst case.
        for (int num:numbers) {

            if(num==100){
                System.out.println("Found");
            }

        }

        ArrayList<Integer> integerArrayList= new ArrayList<>();
        integerArrayList.add(30);
        integerArrayList.add(40);
        integerArrayList.add(50);
        integerArrayList.add(60);
        integerArrayList.add(100);
        System.out.println(integerArrayList.contains(100));
        //internally contains method is doing the same going through all the elements to search

        Map<Integer,String> studentsInfo = new HashMap<>();
        studentsInfo.put(11234,"Farhad");
        studentsInfo.put(5685, "Sharif");
        System.out.println(studentsInfo.get(5685));//not going through all the data

    }
}
