package com.syntax.Practice;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SD {
    public static void main(String[] args) {

       Map<Integer, String> map= new HashMap<>();
       map.put(1, "Apple");
       map.put(2, "Banana");
       map.put(3, "Apricot");
       map.put(4, "Grape");

       //Set<String> keys= map.key();
        System.out.println(map.keySet());


    }
}
