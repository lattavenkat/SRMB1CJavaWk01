package com.srm.cjava.wk02.day07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class UpperCase {
    public static void main(String[] args) throws IOException {
        String str = " ";
        FileReader fr1 = new FileReader("D:\\file1.txt");
        PrintWriter writer2 = (new PrintWriter(new FileWriter("D:\\upper.txt")));
        BufferedReader br1 = new BufferedReader(fr1);
        while ((str = br1.readLine()) != null) {
            writer2.write(str.toUpperCase());
        }
        System.out.println("File content is converted to uppercase");
        writer2.close();

        br1.close();
    }

}