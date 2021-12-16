package com.syntax.class26.Tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

//Create an arrayList of words. Remove every word that ends with “e”.
public class Task2 {
    public static void main(String[] args) {
        ArrayList<String>arrayList= new ArrayList<>();
        arrayList.add("Life");
        arrayList.add("Orange");
        arrayList.add("Car");
        arrayList.add("Lamp");
        arrayList.add("Purple");
        arrayList.add("Love");
        System.out.println(arrayList);

      /*  Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            String word= iterator.next();
            if(word.toLowerCase().endsWith("e")){
                iterator.remove();
            }
        }*/
        System.out.println("******************");


        arrayList.removeIf(element-> element.endsWith("e"));

        System.out.println(arrayList);
    }
}
