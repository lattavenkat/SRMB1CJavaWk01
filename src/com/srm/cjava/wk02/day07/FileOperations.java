package com.srm.cjava.wk02.day07;

import java.io.File;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) throws IOException{
        File f = new File("D:\\file1.txt");

        System.out.println("File Name is: " + f.getName());
        if (f.exists()) {
            System.out.println("File f is available");
        } else {
            System.out.println("There is no file named f exists");
        }
        System.out.println("Checking if the file f is Readable? " + f.canRead());
        System.out.println("Checking if the file f is Writeable? " + f.canWrite());
        System.out.println("Checking the type: " + f.isFile());
        System.out.println("File Size: " + f.length());
    }
}
