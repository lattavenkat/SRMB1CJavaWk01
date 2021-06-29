package com.srm.cjava.wk01.day04;

public class CountNo {
    public static void main(String[] args) {
        int count=0;
       
        String str = args.toString();
        
        char ch[] = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            if (Character.isDigit(str.charAt(i))) {
                if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0))) {
                    count++;
                }
            }
        }      
        System.out.println("the number of digits in the given string is:" +count);
    }
}
