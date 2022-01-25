package com.syntax.class29;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {

       String path = "Files/ExcelData.xlsx";
       FileInputStream fileInputStream = new FileInputStream(path);
       XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
       XSSFSheet sheet = xssfWorkbook.getSheet("Sheet1");
       int numberOfRows = sheet.getPhysicalNumberOfRows();
       System.out.println(numberOfRows);

        for (int i = 0; i < numberOfRows; i++) {

            Row row= sheet.getRow(i);
            int numberOfCells = row.getPhysicalNumberOfCells();
            for (int j = 0; j < numberOfCells; j++) {

                System.out.print(row.getCell(j)+" ");

            }
            System.out.println();
            fileInputStream.close();
        }



        }
        }




