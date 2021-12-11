package com.syntax.class26.Tasks;
import java.util.TreeSet;

//Create a Set of cities in which you want to make sure that insertion order is maintained. Then remove any city that starts with “A”;
public class Task7 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("London");
        treeSet.add("Paris");
        treeSet.add("Ankara");
        treeSet.add("Alexandria");
        treeSet.add("Kabul");
        treeSet.add("San Francisco");
        treeSet.removeIf(element-> element.startsWith("A"));
        System.out.println(treeSet);
        }
    }

