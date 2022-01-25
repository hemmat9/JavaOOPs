package com.syntax.class30;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo1 {
    public static void main(String[] args) throws IOException {
        String path="Files/ExcelData.xlsx";//Location of the file
        FileInputStream fileInputStream=new FileInputStream(path);//to read data we import FileInputStream Class

        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);//there is no load method that is why we have to pass fileInputStream inside the Constructor.
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");//Getting the sheet from the Excel file

        Row row=sheet.getRow(0);//Location of the row
        Cell cell=row.getCell(1);//Files/Batch11.xlsx Column
        System.out.println(cell);//we print out the data in that particular column or Cell
        fileInputStream.close();



    }
}
