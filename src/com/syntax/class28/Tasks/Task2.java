package com.syntax.class28.Tasks;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//Create a map of countries with its capital that will store countries in alphabetical order.
//Print all keys and values from a country map using for each loop and iterator.
//Print all values from a country map using for each loop and iterator.
public class Task2 {

    public static void main(String[] args) {
        TreeMap<String, String> country = new TreeMap<>();
        country.put("USA", "Washington DC");
        country.put("Afghanistan", "Kabul");
        country.put("Canada", "Toronto");
        country.put("Turkey", "Ankara");
        country.put("Pakistan", "Islamabad");

        System.out.println(country);

        Set<Map.Entry<String, String>> entrySet= country.entrySet();//both keys and values
        for (Map.Entry<String, String > countries: entrySet) {
            System.out.println(countries.getKey()+" "+countries.getValue());
        }
        Iterator<String> iterator= country.values().iterator();//values
        while(iterator.hasNext()){
            String value= iterator.next();
        }
        System.out.println(country.values());

        Iterator<String> iterator1= country.keySet().iterator();//keys
        while(iterator1.hasNext()){
            String keys = iterator1.next();
        }
        System.out.println(country.keySet());

    }
}
