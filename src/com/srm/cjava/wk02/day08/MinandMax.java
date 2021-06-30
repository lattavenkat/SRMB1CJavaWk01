package com.srm.cjava.wk02.day08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinandMax {
    public static void main(String[] args) {
        System.out.println("FINDING MINIMUM AND MAXIMUM IN AN ARRAYLIST");
        int num = 0;
        int min;
        int max;
        
        int i;
        ArrayList<Integer> array = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        int ch = sc.nextInt();
        System.out.println("Enter a number");
                for (i = 0; i < 5; ++i) {
                    num = sc.nextInt();
                    array.add(num);
                }
        switch (ch) {
            case 1:
                
                max = Collections.max(array);
                min = Collections.min(array);
                System.out.println("Max: " + max);
                System.out.println("Min: " + min);

                break;
            case 2:
            int min1 = array.get(0);
            int max1 = array.get(0);
            while(true){
                for (int j=0 ; j < 5; j++) {
                    if (array.get(j) < min1) {
                        min1 = array.get(j);
                    }
                }
                for (int j=1 ; j < 5; j++) {
                    if (array.get(j) > max1) {
                          max1 = array.get(j);
                    }
                }
                System.out.println("Min: " + min1);
                System.out.println("Max: " + max1);
               
            break;
            } 
            default:
                System.out.println(" ");
        }

        sc.close();
    }
}
