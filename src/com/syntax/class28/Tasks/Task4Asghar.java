package com.syntax.class28.Tasks;

import java.util.HashMap;
import java.util.Map;

public class Task4Asghar {

    public static void main(String[] args) {
        HashMap<String, Integer> employeeMap = new HashMap<>();
        employeeMap.put("John",120000);
        employeeMap.put("Smith",100000);
        employeeMap.put("Jane",130000);
        employeeMap.put("Alexey",150000);

        String maxSalaryEmpName="";
        double maxSalary=0;
        double sum=0;

        for (Map.Entry <String, Integer> emp:employeeMap.entrySet()
             ) {
           // sum=sum+emp.getValue();
            if (emp.getValue()>maxSalary){
                maxSalary=emp.getValue();
                maxSalaryEmpName=emp.getKey();
            }

        }
        System.out.println(maxSalaryEmpName+" $"+(int)maxSalary);
        //System.out.println("The Sum of all salaries :"+sum);


    }
}
