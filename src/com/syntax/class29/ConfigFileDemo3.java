package com.syntax.class29;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileDemo3 {
    public static void main(String[] args) throws IOException {
        String path= "Files/Trump.properties";
        Properties properties = new Properties();
        properties.put("UserName","Farhad123");
        properties.put("password", "Pass123");

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        properties.store(fileOutputStream, "creating a new file");

        fileOutputStream.close();


    }
}
