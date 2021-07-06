package com.srm.cjava.wk02.day13;

import java.util.Scanner;

public class Vowel {

    public static void main(String[] args) {
        int i = 0;
        char ch;
        System.out.println("Enter a sentence: ");
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        for (int j = 0; j < str.length(); j++) {
            ch = str.charAt(j);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                        i++;                                        
            }
        }
        System.out.println("There are " +i+  " vowels present in '" +str+ "'");
        sc.close();   
    }
    }

