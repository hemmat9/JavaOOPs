package com.syntax.reviewClass10;

public class DataBaseTester {
    public static void main(String[] args) {
        DataBase dataBase = new InformixDataBase(10);
        dataBase.openDataBase();
        dataBase.readData();
        dataBase.editData();
        dataBase.closeData();
    }
}
