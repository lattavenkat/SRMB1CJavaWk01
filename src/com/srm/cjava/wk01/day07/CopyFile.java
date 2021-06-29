package com.srm.cjava.wk01.day07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream sourcefile = new FileInputStream("D:\\file1.txt");
        File f = new File("D:\\file2.txt");
        if (f.exists() && !f.isDirectory()) {
            System.out.println("File 2 is already available in D directory");
        } else {
            FileOutputStream destinationfile = new FileOutputStream("D:\\file2.txt");
            try {
                do {
                    i = sourcefile.read();
                    if (i != -1) {
                        destinationfile.write(i);
                    }
                } while (i != -1);
                System.out.println("Data from File 1 is copied to File 2");
                sourcefile.close();
                destinationfile.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
}
