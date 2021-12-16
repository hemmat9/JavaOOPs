package com.syntax.class26.Tasks;
import java.util.Iterator;
import java.util.Locale;
import java.util.TreeSet;

//Create a Set of cities in which you want to make sure that insertion order is maintained. Then remove any city that starts with “A”;
public class Task7 {
    public static void main(String[] args) {
        TreeSet<String> cities = new TreeSet<>();
        cities.add("London");
        cities.add("Paris");
        cities.add("Ankara");
        cities.add("Alexandria");
        cities.add("Kabul");
        cities.add("San Francisco");
        System.out.println(cities);

        cities.removeIf(element-> element.startsWith("A"));
        System.out.println(cities);

        Iterator<String> iterator=cities.iterator();
        while (iterator.hasNext()){
           String city=  iterator.next();
           if(city.startsWith("A")){
               iterator.remove();
           }

        }
        System.out.println(cities);
        }
        }


