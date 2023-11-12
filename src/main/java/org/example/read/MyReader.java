package org.example.read;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;
import org.example.model.Human;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyReader {

    /**
     * reads data from a csv file, converts each row into an object of class Human and adds it to the list
     * @param filePath path to csv file
     * @param separator the delimiter by which strings are divided into elements
     * @return a list containing information from a file in the form of objects of class Human
     */
    public List<Human> readCSV(String filePath, String separator) {
        List<Human> list = new ArrayList<>();
        try {
            CSVReader csvReader = new CSVReaderBuilder(new FileReader(filePath)).build();
            String[] nextLine = csvReader.readNext();

            while ((nextLine = csvReader.readNext()) != null) {
                list.add(new Human(String.join(", ", nextLine).split(separator)));
            }

            csvReader.close();
        } catch (CsvValidationException | IOException e) {
            throw new RuntimeException(e);
        }

        return list;
    }
}