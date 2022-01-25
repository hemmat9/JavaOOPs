package com.syntax.Practice;


import java.util.*;

public class Drinks {
    public static void main(String[] args) {

        Map<String, Integer> map = new TreeMap<>();


        map.put("Farhad", 100);
        map.put("Haleema", 12);
        map.put("Yusuf", 1);
        map.put("Ayesha", 2);
        map.put("Ibrahim", 8);

        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println(map);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for(Map.Entry<String, Integer> entry: entrySet){

            System.out.println(entry.getKey()+" = "+ entry.getValue());

        }


    }
}
