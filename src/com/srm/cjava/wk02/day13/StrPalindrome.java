package com.srm.cjava.wk02.day13;

import java.util.Scanner;

public class StrPalindrome {
    static int chkpalindrome(String str){
        String temp = "";
        StringBuffer stf;
        int count = 0;
      
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
               
                temp = str.substring(i, j);                  
                if (temp.length() >= 2) {                  
                    stf = new StringBuffer(temp);
                    stf.reverse();                  
                    if (stf.toString().compareTo(temp) == 0)
                        count++;
                }
            }
        }
       
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter string: ");
        String str  = sc.nextLine();
        System.out.println("Number of palindrome strings in ,"+str+", is " +chkpalindrome(str));
       
      
        sc.close();
    }
}
