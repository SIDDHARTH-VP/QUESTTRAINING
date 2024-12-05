package com.quest.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        File file=new File("file1.txt");

//        try {
//            if(file.createNewFile()){
//                System.out.println("File exists"+file.getAbsolutePath());
//            }else {
//                System.out.println("File not exists");
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try {
            System.out.println("Try started");
            if(!file.exists()){
                file.createNewFile();
                Scanner sc= null;
                try {
                    sc = new Scanner(file);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
//                while (sc.hasNextLine()) {
//                    String line=sc.nextLine();
//                    System.out.println(line);
//                }
                sc.close();
                System.out.println("File is createdDone");
            }else{
                System.out.println("File does not exist");
            }
            System.out.println("Try ended ");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            file.delete();
            System.out.println("File deleted");
        }


    }
}
