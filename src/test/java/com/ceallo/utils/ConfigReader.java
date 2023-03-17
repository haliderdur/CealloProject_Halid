package com.ceallo.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    // Created the object of Properties
    private static Properties properties = new Properties();

    static {
        try {
            // open a file in java memory
            FileInputStream file = new FileInputStream("config.properties");
            // load properties object with using FileInputStream object
            properties.load(file);
            // close the file
            file.close();
        } catch (
                IOException e) {
            System.out.println("File not found in configReader class");
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyword) {
        return properties.getProperty(keyword);
    }

}
