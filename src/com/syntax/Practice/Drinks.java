package com.syntax.Practice;

import java.util.ArrayList;

//Create an arrayList of drinks. If any drink has letters “a” or “e” replace it with water.
public class Drinks {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Tea");
        drinks.add("Coffee");
        drinks.add("Soft drinks");
        drinks.add("Pepsi");
        drinks.add("Water");
        drinks.add("Hot Chocolate");
        drinks.add("Lemon Tea");

        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                drinks.set(i, "Water");
            }

        }
        System.out.println(drinks);
    }
}
