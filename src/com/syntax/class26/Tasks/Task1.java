package com.syntax.class26.Tasks;

import java.util.ArrayList;

//Create an arraylist of cars and retrieve all the values using 3 different ways.
public class Task1 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Tesla");
        arrayList.add("Toyota");
        arrayList.add("Honda");
        System.out.println(arrayList);

        for (String arr:arrayList){
            System.out.print(arr+", ");
        }
        System.out.println();
        for (int i=0; i< arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
}
