package com.syntax.class28;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Demo7 {
    public static void main(String[] args) {
        HashMap<String, Double> grocery= new LinkedHashMap<>();
        grocery.put("egg", 5.5);
        grocery.put("rice",4.5);
        grocery.put("milk", 4.3);
        grocery.put("tomato", 6.5);

        System.out.println(grocery);
        Iterator<Double> iterator= grocery.values().iterator();//from map get set then from set get Iterator
        while(iterator.hasNext()){
           Double value = iterator.next();
            if(value==4.3){
                iterator.remove();
            }
        }
        System.out.println(grocery);
    }
    }

