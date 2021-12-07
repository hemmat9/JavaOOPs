package com.syntax.class26;

import java.util.HashSet;
import java.util.LinkedList;

public class SetDemo1 {

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();//hasSet do not accept duplication of elements, but we can store duplicate elements.
        //the difference between HashSent and linkedList: hasSet don't keep the duplication, and does not maintain the order. But LinkedList keep the duplication and maintains the order.
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Kiwi");
        hashSet.add("Apple");
        hashSet.add("Apple");
        System.out.println(hashSet);
    }
}
