package com.syntax.Practice;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class ExcelClass {
    public static void main(String[] args) throws IOException {
        HashMap<String, Double> grocery = new LinkedHashMap<>();
        grocery.put("egg", 5.5);
        grocery.put("rice", 4.5);
        grocery.put("milk", 4.3);
        grocery.put("tomato", 6.5);
        grocery.put("potato", 5.2);

        System.out.println(grocery);
        Iterator<String> iterator = grocery.keySet().iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.contains("e")) {
                iterator.remove();
            }
        }
        System.out.println(grocery);

    }
}