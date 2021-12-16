package com.syntax.class26.Tasks;
/*Create a Set collection in which you need to add names of the countries.
In this set we want all objects to be sorted in alphabetical order. Using 2 different ways retrieve all elements from se*/

import java.util.Iterator;
import java.util.TreeSet;

public class Task6 {
    public static void main(String[] args) {

        TreeSet<String> countries = new TreeSet<>();
        countries.add("Afghanistan");
        countries.add("Pakistan");
        countries.add("United States");
        countries.add("India");
        countries.add("Turkey");
        countries.add("Brazil");
        //System.out.println(countries);

        for(String str:countries){
            System.out.println(str);
        }
        System.out.println("****************************");
        Iterator<String> iterator = countries.iterator();

        for (int i=0; i< countries.size();i++){
            System.out.println(iterator.next());
        }
        System.out.println("========================");

        Iterator<String>iterator1= countries.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
     }
    }

