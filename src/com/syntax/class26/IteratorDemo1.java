package com.syntax.class26;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("TestNg");
        subjects.add("Git");

        Iterator<String> iterator= subjects.iterator();//when we call iterator method all the elements are copied inside the iterator
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        iterator.next();
        iterator.remove();

        //System.out.println(iterator.next());
       // iterator.remove();
        System.out.println(subjects);
        //System.out.println(iterator.hasNext());
        //System.out.println(iterator.next());
    }
}