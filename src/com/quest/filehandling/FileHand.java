package com.quest.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileHand {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("File.txt");
            fw.write("Hello World writter exp");
            fw.append('a');
            fw.close();
            System.out.println("File written successfully");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
