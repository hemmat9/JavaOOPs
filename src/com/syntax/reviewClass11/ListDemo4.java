package com.syntax.reviewClass11;

import java.util.ArrayList;
import java.util.List;

public class ListDemo4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(30);
        arrayList.add(10);

        int counter =0;
        for (Integer number:arrayList
             ) {
            if(number>3){
                counter++;
            }
        }
        System.out.println(counter);

       arrayList.stream().filter(x->x>3).count();//this does the same job as forEach loop does to count
        System.out.println(arrayList.stream().filter(x->x>3).count());//remove the elements which are greater than 3
        List<Integer>list= arrayList.subList(3,5);//if we are interested in a specific part of the list
        System.out.println(list);
    }
}
