package com.srm.cjava.wk01.day04.UserDefinedExcp;

import java.util.Scanner;

public class Student {
    int rollnumber;
    String name;

    static void validate(int mark) throws MarkOutofBoundExcp {

        if (mark < 0 || mark > 100) {
            throw new MarkOutofBoundExcp("NOT VALID");
        } else {
            System.out.println("GOOF WORK! KEEP IMPROVING!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mark : ");
        int n = sc.nextInt();
        try {
            validate(n);
        } catch (Exception e) {
            System.out.println("EXCEPTION OCCURED!: " + e);
        }
        sc.close();
    }
}
