package com.syntax.class28.Tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task6 {
//Create a collection of integers in which you can keep duplicates.
//Write a logic to find sum of all integers
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(50);

        Integer sum= 0;
        for (int i = 0; i < list.size(); i++) {

            sum=sum+ list.get(i);


        }
        System.out.println(sum);
    }
}
