package com.syntax.class28;

import java.util.LinkedHashMap;

public class Demo3 {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();
        students.put(10,"Farhad");
        students.put(10,"Alexy"); //keys should be unique if we insert the data with same key it will replace the old data
        students.put(20, "Denis");
        students.put(100,"Henok");
        students.put(10,"Alex");
        System.out.println(students);
    }
}
