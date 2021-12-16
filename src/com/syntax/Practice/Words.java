package com.syntax.Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

//Create an arrayList of words. Remove every word that ends with “e”.
public class Words {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Book");
        words.add("Lamp");
        words.add("Love");
        words.add("Care");
        words.add("life");
        System.out.println(words);

        for (int i = 0; i < words.size(); i++) {

            if (words.get(i).contains("o")){
                words.set(i,"Farhad");
            }
        }
        System.out.println(words);
    }
}
