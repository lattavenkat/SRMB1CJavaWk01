package com.srm.cjava.wk01.day01;

import java.util.Scanner;
import java.util.logging.Logger;

public class AscendingOrder {
    static Logger logg = Logger.getLogger(AscendingOrder.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        // AscendingOrder
        logg.info("Enter no of elements in an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array elements in ascending order:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
