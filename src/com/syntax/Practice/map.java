package com.syntax.Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class map {
    public static void main(String[] args) {

        Map<String, Integer> students= new HashMap<>();
        students.put("Farhad", 123);
        students.put("Ibrahim", 456);
        students.put("Yusuf",789);
        students.put("Haleema", 147);
        students.put("Ayesha",258);
        System.out.println(students);

        Iterator<Integer> iterator= students.values().iterator();
        while (iterator.hasNext()){
            Integer key = iterator.next();
            if(key==123){
                iterator.remove();
            }
        }
        System.out.println(students);
    }
}
