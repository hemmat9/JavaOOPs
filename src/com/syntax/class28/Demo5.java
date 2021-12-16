package com.syntax.class28;

import java.util.*;

public class Demo5 {
    public static void main(String[] args) {
        HashMap<String, Double> grocery= new LinkedHashMap<>();
        grocery.put("egg", 5.5);
        grocery.put("rice",4.5);
        grocery.put("milk", 4.3);
        grocery.put("tomato", 6.5);

        Set<String> keys= grocery.keySet();//to get the keys only separately from map, it returns it in Set coz keys can not be duplicate
        System.out.println(keys);
        Collection<Double> values = grocery.values();//to get the values only separately from map, it is returned as collection coz values can be duplicate
        System.out.println(values);

    }
}
