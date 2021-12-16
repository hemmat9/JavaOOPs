package com.syntax.Practice;

public class LargestNumberInArray {

    public static void main(String[] args) {
        int [] number= {12,45,78,96,68,955,7};

        int maxNumber= number[0];
        int minNumber= number[0];

        for (int i = 0; i < number.length; i++) {

            if(number[i]>maxNumber) maxNumber=number[i];
            if(number[i]<minNumber) minNumber=number[i];

        }
        System.out.println(maxNumber);
        System.out.println(minNumber);
    }
}
