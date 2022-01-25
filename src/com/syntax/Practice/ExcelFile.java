package com.syntax.Practice;
import utils.ExcelReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelFile {
    public static void main(String[] args) throws IOException {
        String path ="C:\\Users\\farha\\Desktop\\Excel Files\\Family.xlsx";
        List<Map<String,String>>excelData= ExcelReader.read(path);
        System.out.println(excelData);
    }
}
