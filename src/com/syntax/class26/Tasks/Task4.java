package com.syntax.class26.Tasks;

import java.util.ArrayList;
import java.util.Iterator;

//Create an arrayList of even numbers from 1 to 50. Remove any number that is divisible by 5 from that arrayList.
public class Task4 {

    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int i = 1; i <= 50; i++) {
            evenNumbers.add(i);
        }

        System.out.println(evenNumbers);

        Iterator<Integer> iterator = evenNumbers.iterator();
        while(iterator.hasNext()){
            Integer number = iterator.next();
            if(number%5==0){
                iterator.remove();
            }
        }
        System.out.println(evenNumbers);

    }
}
