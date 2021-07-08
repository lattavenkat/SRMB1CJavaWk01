package com.srm.cjava.wk03.day13;

public class SubSet {
    static void subString(char str[], int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {

                int x = j + i - 1;
                for (int k = j; k <= x; k++) {
                    System.out.print(str[k]);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        char str[] = { 'a', 'b', 'c' };
        subString(str, str.length);
    }
}