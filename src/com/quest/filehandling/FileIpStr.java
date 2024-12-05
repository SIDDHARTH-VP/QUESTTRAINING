package com.quest.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIpStr {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("File.txt");

            System.out.println("File is created Sucessfully");
            int c;
            String str="Input as string" +
                    "\nhello world"+
                    "\nasdfghjk"+
                    "\nasdfghj"+
                    "\nzxcvbnm"+
                    "\nqwertyuio"+
                    "\n0123456789"+
                    "\nasdfghjkl"+
                    "\nzxcvbnm"+
                    "\n it comes to an end";
            FileOutputStream fos=new FileOutputStream("File.txt",true);
           fos.write(str.getBytes());
            fos.write("\nThrough append".getBytes());
            fos.write("\nThrough append adding".getBytes());
            fos.write("\nThrough append adding new".getBytes());
            fos.write("\nThrough append adding new line".getBytes());
            fos.write("\nThrough append adding new line to showcase".getBytes());
            while ((c=fis.read())!=-1) {
                System.out.print((char)c);
            }
//            fis.read();
//           fis.close();

            fos.close();
            System.out.println("\nFile read is closed sucessfully");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
