package com.syntax.class26.Tasks;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTester {
    public static void main(String[] args) {
        ArrayList<Insurance> arrayList = new ArrayList<>();
        arrayList.add(new Car("AAA","Camry"));
        arrayList.add(new Pet("Gieco", "Cat"));
        arrayList.add(new Health("Kaiser"));

        for (Insurance insurance : arrayList) {
            insurance.getQuote();
            insurance.cancelInsurance();
        }

    }
}
