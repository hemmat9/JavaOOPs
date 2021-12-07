package com.syntax.class26;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {

    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNg");

        Iterator<String> iterator = subjects.iterator();
        while(iterator.hasNext()){//this is how to remove after iteration using iterator class with while loop.
            String element= iterator.next();
            if(element.length()>4){
                iterator.remove();
            }
        }

        System.out.println(subjects);
    }
}
//subjects.removeIf(element-> element.length()>4);//limda experassion