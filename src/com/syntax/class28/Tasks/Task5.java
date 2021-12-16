package com.syntax.class28.Tasks;

import org.apache.commons.collections4.list.TreeList;

import java.util.Iterator;
import java.util.List;

public class Task5 {
//Create the collection that will store single uniques Objects of a String type in which order is preserved.
//Write a logic to concatenate all string from the collection.
    public static void main(String[] args) {

        List<String> strings = new TreeList<>();
        strings.add("Farhad");
        strings.add("Mahmoud");
        strings.add("John Smith");

        String result = null;

        Iterator<String> iterator= strings.iterator();
        while(iterator.hasNext()){
          Object elements = iterator.next();
            result +=elements;

        }

        System.out.println(result);

        }

    }

