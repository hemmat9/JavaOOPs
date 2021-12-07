package com.syntax.class26;


import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();//it prints by Alphabetical order
        treeSet.add("A");
        treeSet.add("C");
        treeSet.add("Z");
        treeSet.add("D");
        treeSet.add("P");
        System.out.println(treeSet);
    }
}
