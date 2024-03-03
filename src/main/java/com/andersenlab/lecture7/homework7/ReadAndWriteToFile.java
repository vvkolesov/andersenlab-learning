package com.andersenlab.lecture7.homework7;

import static com.andersenlab.lecture7.homework7.readerwriter.ReadFromFile.readFromFile;
import static com.andersenlab.lecture7.homework7.readerwriter.WriteToFile.writeToFile;


public class ReadAndWriteToFile {

    public static void main(String[] args) {

        String url = ".\\src\\files\\new.csv";
        String text = "Value 1;Value 2;Value 3\n" +
                        "100;200;123\n" +
                        "300;400;500";
        String text2 = "Value 4;Value 5;Value 6\n" +
                "300;400;500\n" +
                "600;700;800";

        writeToFile(url, text);
        readFromFile(url);
        writeToFile(url, text2);
        readFromFile(url);
    }
}
