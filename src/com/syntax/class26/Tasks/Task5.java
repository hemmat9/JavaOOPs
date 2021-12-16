package com.syntax.class26.Tasks;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(aList);

        Set<String> Set= new LinkedHashSet<>(aList);
        System.out.println(Set);
    }
}
