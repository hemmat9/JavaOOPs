package com.syntax.reviewClass11;

import utils.ArraysUtil;

import java.util.ArrayList;

public class ListDemo3 {
    public static void main(String[] args) {
        int [] arr ={10,5,87,89,7};
        //how to convert an array of integers to an ArrayList?
        ArrayList <Integer> arrayList = ArraysUtil.convertToArrayList(arr);//this is a method created in Utils package
        System.out.println(arrayList);



    }
}
