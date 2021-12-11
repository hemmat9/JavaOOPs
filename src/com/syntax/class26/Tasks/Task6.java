package com.syntax.class26.Tasks;
/*Create a Set collection in which you need to add names of the countries.
In this set we want all objects to be sorted in alphabetical order. Using 2 different ways retrieve all elements from se*/

import java.util.HashSet;
import java.util.TreeSet;

public class Task6 {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Afghanistan");
        hashSet.add("Pakistan");
        hashSet.add("United States");
        hashSet.add("India");
        hashSet.add("Turkey");
        hashSet.add("Brazil");
        System.out.println(hashSet);

        for(String str:hashSet){
            System.out.println(str);
        }

       TreeSet<String> treeSetSet = new TreeSet<>(hashSet);
        System.out.println(treeSetSet);

               }
    }

