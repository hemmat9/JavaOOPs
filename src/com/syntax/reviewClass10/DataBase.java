package com.syntax.reviewClass10;

public abstract class DataBase {
    int numberOfConnection;
    DataBase(int numberOfConnection){
        this.numberOfConnection=numberOfConnection;
    }
    abstract void openDataBase();
    abstract void readData();
    abstract void editData();
    abstract void closeData();
}
class MySQLServer extends DataBase{

    MySQLServer(int numberOfConnection) {
        super(numberOfConnection);
    }

    @Override
    void openDataBase() {
        System.out.println("Opening the Microsoft Database");

    }

    @Override
    void readData() {
        System.out.println("Reading the Database from Microsoft");

    }

    @Override
    void editData() {
        System.out.println("Editing the Database from Microsoft");

    }

    @Override
    void closeData() {
        System.out.println("Closing the Microsoft Database");

    }
}
class InformixDataBase extends DataBase{
    InformixDataBase(int numberOfConnection) {
        super(numberOfConnection);
    }

    @Override
    void openDataBase() {
        System.out.println("Opening the IBM Database");

    }

    @Override
    void readData() {
        System.out.println("Reading the Database from IBM");

    }

    @Override
    void editData() {
        System.out.println("Editing the Database from IBM");

    }

    @Override
    void closeData() {
        System.out.println("Closing the IBM Database");

    }
}
class GoogleDatabase extends DataBase{
    GoogleDatabase(int numberOfConnection) {
        super(numberOfConnection);
    }

    @Override
    void openDataBase() {
        System.out.println("Opening the Google Database");

    }

    @Override
    void readData() {
        System.out.println("Reading the Database from Google");

    }

    @Override
    void editData() {
        System.out.println("Editing the Database from Google");

    }

    @Override
    void closeData() {
        System.out.println("Closing the Google Database");

    }
}
