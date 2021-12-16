package com.syntax.class25.collectionFramework;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(10);
        System.out.println(numbers);

        ArrayList<Boolean> booleans= new ArrayList<>();//Diamond operator is there to pass a data type inside it. other than that datatype other types are not allowed.
        booleans.add(true);
        booleans.add(false);
        booleans.add(true);
        //booleans.add("aklsdfjlas") it is not allowed inside a boolean datatype because it is a String.
        System.out.println(booleans);

        ArrayList arrayList=new ArrayList();//without data type is a bad practice
        arrayList.add("Simon");
        arrayList.add(10);                  // it is not a good practice
        arrayList.add(false);
        System.out.println(arrayList);

       /* for (Object arr:arrayList){
            System.out.println(((String)arr).length());//compile time does not give any error but runtime gives you error. (Compile time errors are better)
        }*/

    }
}
