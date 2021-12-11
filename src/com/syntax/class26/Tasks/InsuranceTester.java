package com.syntax.class26.Tasks;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTester {
    public static void main(String[] args) {
        ArrayList<Insurance> arrayList = new ArrayList<>();
        arrayList.add(new Car());
        arrayList.add(new Pet());
        arrayList.add(new Health());

        for (Insurance insurance : arrayList) {
            insurance.getQuote();
            insurance.cancelInsurance();
        }
        System.out.println(arrayList);

    }
}
