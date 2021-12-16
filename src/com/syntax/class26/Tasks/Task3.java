package com.syntax.class26.Tasks;
import java.util.ArrayList;
//Create an arrayList of drinks. If any drink has letters “a” or “e” replace it with water.
public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Tea");
        arrayList.add("Coffee");
        arrayList.add("Soft drinks");
        arrayList.add("Pepsi");
        arrayList.add("Water");
        arrayList.add("Hot Chocolate");
        arrayList.add("Lemon Tea");
/*
        for (int i=0; i<arrayList.size(); i++){
            if (arrayList.get(i).contains("a")|| arrayList.get(i).contains("e")){

                arrayList.set(i,"Water");
            }
        }
        System.out.println(arrayList);*/

        for (int i = 0; i < arrayList.size(); i++) {

            if(arrayList.get(i).toLowerCase().replaceAll("[ae]","").length()< arrayList.get(i).length()){
                arrayList.set(i,"Water");
            }
        }
        System.out.println(arrayList);

    }

        }









