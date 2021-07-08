package com.srm.cjava.wk03.day13;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String st = sc.nextLine();
        System.out.println("Enter the character to replace: ");
        String r1 = sc.next();
        System.out.println("Enter the character to be replaced: ");
        String r2 = sc.next();
        System.out.println("After Replacing: " + st.replace(r1, r2));

        sc.close();
    }
}
