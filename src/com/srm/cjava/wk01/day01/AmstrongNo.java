package com.srm.cjava.wk01.day01;

import java.util.Scanner;
import java.util.logging.Logger;

public class AmstrongNo {
    static Logger loog = Logger.getLogger(AmstrongNo.class.getName());
    public static final int NUMB1 = 10;

    public static void main(String[] args) {

        loog.info("AMSTRONG NUMBER");
        loog.info("---------------");
        Scanner sc = new Scanner(System.in);
        loog.info("Enter a Number: ");
        int n = sc.nextInt();
        int a = 0;
        int temp;
        int c = 0;
        temp = n;
        while (n > 0) {
            a = n % NUMB1;
            n = n / NUMB1;
            c += a * a * a;
        }
        if (temp == c) {
            loog.info("Armstrong Number");
        } else {
            loog.info("Not a Armstrong Number");
        }
        sc.close();
    }
}
