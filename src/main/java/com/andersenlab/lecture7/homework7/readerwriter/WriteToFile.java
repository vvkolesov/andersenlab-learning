package com.andersenlab.lecture7.homework7.readerwriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {

    public static void writeToFile(String url, String text) {

        try(FileOutputStream fileOutputStream = new FileOutputStream(url)) {
            byte[] buffer = text.getBytes();
            fileOutputStream.write(buffer, 0, buffer.length);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found");
        } catch (IOException e) {
            throw new RuntimeException("IOException");
        }
    }
}
