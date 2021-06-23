package com.srm.cjava.wk01.day01;

import java.util.Scanner;
import java.util.logging.Logger;

public class CountOddEven {
    public static final Logger logg = Logger.getLogger(CountOddEven.class.getName());

    public static void main(String[] args) {
        // count of odd and even number present
        logg.info("PROGRAM TO COUNT ODD AND EVEN NUMBER ");
        int oddcount = 0;
        int evencount = 0;
        Scanner sc = new Scanner(System.in);
        logg.info("Enter number of elements in an array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        logg.info("Enter Elements Of An Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        logg.info("Odd Numbers:");

        logg.info("Even Numbers:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                System.out.println(arr[i] + " is a Odd Number");
                oddcount++;
            } else {
                System.out.println(arr[i] + " is a Even Number");
                evencount++;
            }
        }
        System.out.println("Count of Odd Number is: " + oddcount);
        System.out.println("Count Of Even Number is: " + evencount);
        sc.close();
    }
}
