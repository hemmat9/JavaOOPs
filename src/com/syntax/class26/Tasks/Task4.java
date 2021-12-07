package com.syntax.class26.Tasks;

import java.util.ArrayList;

//Create an arrayList of even numbers from 1 to 50. Remove any number that is divisible by 5 from that arrayList.
public class Task4 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(8);
        arrayList.add(10);
        arrayList.add(12);
        arrayList.add(14);
        arrayList.add(16);
        arrayList.add(18);
        arrayList.add(20);
        arrayList.add(22);
        arrayList.add(24);
        arrayList.add(26);
        arrayList.add(28);
        arrayList.add(30);
        arrayList.add(32);
        arrayList.add(34);
        arrayList.add(36);
        arrayList.add(38);
        arrayList.add(40);
        arrayList.add(42);
        arrayList.add(44);
        arrayList.add(46);
        arrayList.add(48);
        arrayList.add(50);

        System.out.println(arrayList.size());

        for (int i =0; i< arrayList.size(); i++){

            if(arrayList.get(i)%5==0){
                arrayList.remove(i);
            }

        }
        System.out.println(arrayList);


    }
}
