package com.syntax.class29;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class HowToCreateAFile {
    public static void main(String[] args) throws IOException {

        String path ="Files/Farhad.properties";
        Properties properties = new Properties();
        properties.put("UserName", "FarhadHemmat9");
        properties.put("Password", "Hemmat901");

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        properties.store(fileOutputStream, "Creating a new file");

        fileOutputStream.close();





    }
}
