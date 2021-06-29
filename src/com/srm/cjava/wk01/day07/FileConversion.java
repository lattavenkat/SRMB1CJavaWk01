package com.srm.cjava.wk01.day07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileConversion {
    public static void main(String[] args) throws IOException {
        String str = " ";
        FileReader fr1 = new FileReader("D:\\file1.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: \n 1) TO LOWER CASE 2) TO UPPER CASE");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                PrintWriter writer1 = (new PrintWriter(new FileWriter("D:\\lower.txt")));

                while ((str = br1.readLine()) != null) {
                    writer1.write(str.toLowerCase());
                }
                System.out.println("File content is converted to lowercase");
                writer1.close();
                break;

            case 2:

                PrintWriter writer2 = (new PrintWriter(new FileWriter("D:\\upper.txt")));

                while ((str = br1.readLine()) != null) {
                    writer2.write(str.toUpperCase());
                }
                System.out.println("File content is converted to uppercase");
                writer2.close();
                break;
            default:
                System.out.println("IRRELAVANT VALUE");
        }
        sc.close();
        br1.close();
    }

}