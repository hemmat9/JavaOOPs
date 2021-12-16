package com.syntax.class28.Tasks;
import com.syntax.Practice.map;

import java.util.*;

//Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
//John Smith=$100000
public class Task4 {
    public static void main(String[] args) {
        Map<String, Double> employee = new HashMap();
        employee.put("Farhad", 170000.00);
        employee.put("Ibrahim", 120000.00);
        employee.put("Yusuf", 150000.00);

        Set<Map.Entry<String, Double>> entrySet = employee.entrySet();
        Map.Entry<String, Double> maxSalary = null;
        for (Map.Entry<String, Double> entry : entrySet) {
            if (maxSalary == null || entry.getValue().compareTo(maxSalary.getValue()) > 0) {
                maxSalary = entry;
            }
        }
        System.out.println(maxSalary.getKey() + " =$" + maxSalary.getValue());


        



        }

    }

