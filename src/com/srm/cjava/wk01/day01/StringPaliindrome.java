package com.srm.cjava.wk01.day01;

import java.util.Scanner;
import java.util.logging.Logger;

public class StringPaliindrome {
    static Logger logg = Logger.getLogger(StringPaliindrome.class.getName());

    public static void main(String[] args) {
        String rev = " ";
        logg.info("STRING PALINDROME");
        Scanner sc = new Scanner(System.in);
        logg.info("Enter a string to check if it is a palindrome");
        String original = sc.nextLine();
        for (int i = original.length() - 1; i >= 0; i--) {
             rev = rev + original.charAt(i);
        }

        if (original.equals(rev)) {
            logg.info(" is a palindrome." + original);
        } 
        else {
            logg.info(original + " isn't a palindrome.");
        }
        sc.close();
    }

}
