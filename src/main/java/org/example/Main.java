package org.example;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;
import org.example.model.Human;
import org.example.read.MyReader;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;
import java.util.List;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties properties = getProperties();
        List<Human> list;
        MyReader reader = new MyReader();
        String filePath = properties.getProperty("file.path");
        String separator = properties.getProperty("file.separator");
        list = reader.readCSV(filePath, separator);
    }

    /**
     * takes information from the properties file
     * @return object of the Properties type, containing information from the properties file
     */
    private static Properties getProperties() {
        FileInputStream fis;
        Properties properties = new Properties();
        try {
            fis = new FileInputStream("src/main/resources/application.properties");
            properties.load(fis);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}