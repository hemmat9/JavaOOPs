package com.syntax.class30;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelDemo4 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\farha\\Desktop\\Excel Files\\Batch11.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet1 = xssfWorkbook.getSheet("Sheet1");
        int noOfRows = sheet1.getPhysicalNumberOfRows(); // the number of rows that are not empty
        System.out.println(noOfRows);
        List<Map<String,String>> excelData = new ArrayList<>();
        //to get all the data from that specific sheet then we have to use loop.
        Row row0 = sheet1.getRow(0);

        for (int i = 1; i < noOfRows; i++) {
            XSSFRow row = sheet1.getRow(i);
            LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();//before each row loop it will create
            //int noCells = row.getPhysicalNumberOfCells();
            hashMap.put(row0.getCell(0).toString(), row.getCell(0).toString());
            hashMap.put(row0.getCell(1).toString(), row.getCell(1).toString());//we can also use a loop to avoid redundancy of these codes, in the Demo5
            hashMap.put(row0.getCell(2).toString(), row.getCell(2).toString());
            hashMap.put(row0.getCell(3).toString(), row.getCell(3).toString());
            excelData.add(hashMap);
        }
        System.out.println(excelData);
        fileInputStream.close();
    }
}
