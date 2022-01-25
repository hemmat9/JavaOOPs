package com.syntax.class28.Tasks;

import java.util.HashMap;
import java.util.Map;

public class Max {
    public static void main(String[] args) {
        HashMap<String, Integer> employeeMap = new HashMap<>();
        employeeMap.put("John",120000);
        employeeMap.put("Smith",100000);
        employeeMap.put("Jane",130000);
        employeeMap.put("Alexey",150000);

        String employeeMax =null;
        int maxSalary=0;

        for (Map.Entry<String, Integer> employee:employeeMap.entrySet()
             ) {
            if(employee.getValue()>maxSalary){
                maxSalary=employee.getValue();
                employeeMax=employee.getKey();
            }

        }
        System.out.println(employeeMax+" ="+maxSalary);
    }
}
