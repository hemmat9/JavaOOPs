package com.syntax.Practice;

import java.util.*;

public class SD {
    public static void main(String[] args) {

       HashMap<String, Integer> fruit = new LinkedHashMap<>();
       fruit.put("Banana", 5);
       fruit.put("Apple", 16);
       fruit.put("Melon", 10);
       fruit.put("Apricot", 45);


       Iterator<String> iterator = fruit.keySet().iterator();
       while (iterator.hasNext()){
           String key = iterator.next();
           if(fruit.containsKey("Banana")){
               iterator.remove();
           }
       }
        System.out.println(fruit);
    }
}
