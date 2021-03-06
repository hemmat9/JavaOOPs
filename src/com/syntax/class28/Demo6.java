package com.syntax.class28;

import java.util.*;

public class Demo6 {
    public static void main(String[] args) {
        HashMap<String, Double> grocery = new LinkedHashMap<>();
        grocery.put("egg", 5.5);
        grocery.put("rice", 4.5);
        grocery.put("milk", 4.3);
        grocery.put("tomato", 6.5);

        System.out.println(grocery);
        Iterator<String> keys = grocery.keySet().iterator();//from map get ==>set ==> Iterator
        while (keys.hasNext()) {
           // System.out.println(keys.next());
            String key= keys.next();
           if(key.contains("e")){
               keys.remove();
           }
        }
        System.out.println(grocery);
        }
    }
