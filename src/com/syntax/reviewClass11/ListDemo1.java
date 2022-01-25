package com.syntax.reviewClass11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        LinkedList<String> list1= new LinkedList();//if not using polymorphism always better

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Coke");
        drinks.add(0,"Pepsi");//to add the element at a specific index.(add method is overloaded)
        //drinks.add(5, "Water"); we will get the IndexOutBoundException error because the list doesn't have that index.
        drinks.add("Fanta");
        System.out.println(drinks);
        drinks.remove(0);
        System.out.println(drinks);
        System.out.println(drinks.get(0));
        drinks.set(1,"Pepsi");
        System.out.println(drinks);

    }
}
