package com.syntax.Practice;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Repl209 {
    public static void main(String[] args) {
    /*    import java.util.*;
import java.util.Map.*;
        */
                List<Map<String,Object>> dataList=new ArrayList();
                Map<String ,Object> appleMap= new LinkedHashMap<>();
                appleMap.put("Items","Apple");
                appleMap.put("Price",20.00);
                appleMap.put("Qunatity",10);
                dataList.add(appleMap);
                Map<String ,Object> orangeMap= new LinkedHashMap<>();
                orangeMap.put("Items","Orange");
                orangeMap.put("Price",21.99);
                orangeMap.put("Qunatity",10);
                dataList.add(orangeMap);
                double total=0;
                for(Map<String, Object> maps:dataList){
                    double qunatity=0;
                    double price=0;
                    for(Map.Entry<String,Object> entry:maps.entrySet()){
                        if(entry.getKey().equals("Price")){
                            price=Double.valueOf(entry.getValue().toString());
                        }else if(entry.getKey().equals("Qunatity")){
                            qunatity=Double.valueOf(entry.getValue().toString());
                        }
                        System.out.print(entry.getKey()+": " +entry.getValue());
                    }
                    System.out.print(" SubTotal"+(price*qunatity));
                    System.out.println();
                }
            }
}
