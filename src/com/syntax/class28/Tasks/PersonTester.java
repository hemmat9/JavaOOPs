package com.syntax.class28.Tasks;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
//In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.
public class PersonTester {
    public static void main(String[] args) {
        Map<Integer, String> person = new TreeMap<>();
        Person person1 = new Person("Farhad","Hemmat",34,120000);
        String value1 = person1.printUserDetails();
        person.put(123,value1);

        Person person2 = new Person("Ibrahim","Hemmat",25,110000);
        String value2 = person2.printUserDetails();
        person.put(456,value2);

        Person person3 = new Person("Yusuf", "Hemmat", 35, 150000);
        String value3 = person3.printUserDetails();
        person.put(789, value3);


        Set<Map.Entry<Integer, String>> entrySet = person.entrySet();
        for (Map.Entry<Integer, String> entry:entrySet
        ) {
            System.out.println(entry);
        }
    }
}
