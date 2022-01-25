package com.syntax.class28.Tasks;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//Create a map of Best Buy store. Place
//item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//Retrieve all keys and values from a Best Buy map using EntrySet.
public class Task3 {
    public static void main(String[] args) {
        Map<Integer, String> bestBuy= new TreeMap<>();
        bestBuy.put(766487,"Printer");
        bestBuy.put(7879885, "TV");
        bestBuy.put(89586,"Laptop");
        bestBuy.put(789585,"Playstation5");

       Set<Map.Entry<Integer, String>> entrySet= bestBuy.entrySet();
        for (Map.Entry<Integer, String>entry:entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }


        }

    }

