package com.syntax.class30;
import utils.ExcelReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelDemo6 {
    public static void main(String[] args) throws IOException {
        String path="Files/ExcelData.xlsx";
        List<Map<String,String>> excelData=ExcelReader.read(path);
        System.out.println(excelData);//we have also .get() method available here like(excelData.get(0))

    }

}
