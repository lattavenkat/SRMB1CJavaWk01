package com.srm.cjava.wk02.day07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LowerCase {
    public static void main(String[] args) throws IOException {
        String str = " ";
        FileReader fr1 = new FileReader("D:\\file1.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        PrintWriter writer1 = (new PrintWriter(new FileWriter("D:\\lower.txt")));

        while ((str = br1.readLine()) != null) {
            writer1.write(str.toLowerCase());
        }
        System.out.println("File 1 content is converted to lowercase");
        writer1.close();
    }
}
