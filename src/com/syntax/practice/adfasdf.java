package com.syntax.practice;

import java.util.ArrayList;

public class adfasdf {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Farhad");
        arrayList.add("Ghani");
        arrayList.add("Wahab");

        ArrayList<String>arrayList1 = new ArrayList<>();
        arrayList1.add("Farhad");
        arrayList1.add("Wahab");
        arrayList1.add("Yusuf");

        /*arrayList.retainAll(arrayList1);
        System.out.println(arrayList);
        System.out.println(arrayList1.size());*/


        System.out.println(arrayList.contains("Wahab"));
    }
}
