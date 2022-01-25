package com.syntax.Practice;

import java.util.*;

public class Tester {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Farhad", 2);
        map.put("Ibrahim", 4);
        map.put("Yusuf", 5);
        map.put("Haleema", 3);
        map.put("Ayesha", 1);

     Set<Map.Entry<String, Integer>> set= map.entrySet();
        System.out.println(set);

    }
}
