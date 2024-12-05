package com.quest.filehandling;

import java.io.*;

public class Buffered {
    public static void main(String[] args) {
        String str = "Hello World";
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("File.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("destination.txt"));
            byte[] buf = new byte[1024];
            int c;
            while ((c = bis.read(buf)) != -1) {
                System.out.println((char) c);
                bos.write(buf, 0, (char)c);

            }
            bos.flush();
            bis.close();
            bos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

