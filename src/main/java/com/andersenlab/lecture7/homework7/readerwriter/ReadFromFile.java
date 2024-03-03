package com.andersenlab.lecture7.homework7.readerwriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadFromFile {

    public static void readFromFile(String url) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(url))) {
            String[] header = bufferedReader.readLine().split(";");
            System.out.println(Arrays.toString(header));
            while (bufferedReader.readLine() != null) {
                String[] data = bufferedReader.readLine().split(";");
                String[] rows = new String[data.length];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = data[i];
                }
                System.out.println(Arrays.toString(rows));
            }
        } catch (FileNotFoundException ex) {
            throw new RuntimeException("File not found");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
