package com.syntax.class26.Tasks;

import java.util.ArrayList;
import java.util.Iterator;

//Create an arraylist of cars and retrieve all the values using 3 different ways.
public class Task1 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Tesla");
        arrayList.add("Toyota");
        arrayList.add("Honda");
        System.out.println(arrayList);
        System.out.println("********************************");
        //for loops are not recommended if we are changing the size of an array or bring any changes to it otherwise it is okay.
        for (String arr:arrayList){
            System.out.println(arr);
        }
        System.out.println("********************************");

        for (int i=0; i< arrayList.size(); i++){
            System.out.println(arrayList.get(i));

        }
        System.out.println("************************************");
        int i=0;
        while (i<arrayList.size()){
            System.out.println(arrayList.get(i));
            i++;
        }
        System.out.println("************************************");
        Iterator<String>iterator=arrayList.iterator();
        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }
        System.out.println("************************************");
        System.out.println(arrayList.get(arrayList.size()-2));//to print last or second last
    }
}
