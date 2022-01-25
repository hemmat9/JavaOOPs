package com.syntax.class28;

import java.util.Iterator;
import java.util.TreeMap;

public class Demo4 {
    public static void main(String[] args) {

        TreeMap<String, Double> groceriesList1 = new TreeMap<>();
        groceriesList1.put("Egg", 3.99);
        groceriesList1.put("Tomato", 3.2);
        groceriesList1.put("Potato", 10.0);
        groceriesList1.put("Milk", 5.0);
        groceriesList1.put("Steak", 15.0);
        //groceriesList1.put("Garlic", 10); Auto conversion does not work in wrapper classes

        TreeMap<String, Double> groceriesList2 = new TreeMap<>();
        groceriesList2.put("soap", 20.0);
        groceriesList2.put("Shampoo", 13.2);
        groceriesList2.put("Onion", 2.0);
        groceriesList2.put("Grapes", 15.5);

        TreeMap<String, Double> groceriesList = new TreeMap<>();//sorting take place based on ascii table(UpperCase first, then LowerCase), that is why "soap" is at the end.
        groceriesList.putAll(groceriesList1);
        groceriesList.putAll(groceriesList2);
        System.out.println(groceriesList);

       }
}
