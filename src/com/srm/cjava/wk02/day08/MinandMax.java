package com.srm.cjava.wk02.day08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinandMax {
    public static void main(String[] args) {
        int num = 0;
        int min = 0;
        int max = 0;
        int i = 0;

        ArrayList<Integer> array = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 5; ++i) {
            System.out.println("Enter a number");
            num = sc.nextInt();
            array.add(num);
        }
        max = Collections.max(array);
        min = Collections.min(array);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        sc.close();
    }
}
