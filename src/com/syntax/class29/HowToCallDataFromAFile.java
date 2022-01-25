package com.syntax.class29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class HowToCallDataFromAFile {
    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\farha\\IdeaProjects\\SDETBatch11\\Files\\Farhad.properties";

        FileInputStream fileInputStream= new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fileInputStream);

        System.out.println(properties.get("UserName"));
        System.out.println(properties.get("Password"));

    }
}
