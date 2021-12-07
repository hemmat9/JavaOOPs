package com.syntax.class25;

import com.sun.javafx.collections.ArrayListenerHelper;

import java.util.ArrayList;

//Create an ArrayList that will store 5 names into it.
//Find out whether the given ArrayList is empty or not?
//Check whether the specific name is present in an ArrayList or not?
//Find the size of your arrayList and print all values from that
public class Task {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Farhad");
        names.add("Mohammad");
        names.add("Sharif");
        names.add("Yusuf");
        names.add("Ibrahim");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Farhad"));
        System.out.println(names.size());
        System.out.println(names);



    }
}
