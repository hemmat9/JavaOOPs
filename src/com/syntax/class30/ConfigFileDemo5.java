package com.syntax.class30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileDemo5 {
    public static void main(String[] args) throws IOException {

        String path="Files/Config.properties";//Relative path to the file is always preferred
       /* Reading the data in the form of raw byte into java Program.
        We should always load the data in the java program before we write
        the new data to that file using fileOutputStream
        to avoid losing data*/
        FileInputStream fileInputStream = new FileInputStream(path);
        Properties properties= new Properties();//To read the raw data we import properties class.
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("userName"));
        System.out.println(properties.getProperty("password"));

        properties.setProperty("URL", "www.google.com");//to send data to that file
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        properties.store(fileOutputStream, "Added new property URL");//if we don't use FileInputStream and load new data then all the data is removed, and we have only the new data.

        properties.setProperty("Server", "Development");
        FileOutputStream fileOutputStream1 = new FileOutputStream(path);
        properties.store(fileOutputStream1,"Added new properties to Dev");





    }
}
