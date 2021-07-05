package com.srm.cjava.wk02.day12;

import java.util.Scanner;
import java.util.TreeSet;

public class ArrDuplicate {
    public static void main(String[] args) {

        int num,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array limit");
        int n = sc.nextInt();
        System.out.println("Enter " +n+ " number");

        int[] arr = new int[n];
        for ( i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Array Elements are: ");
        for (i=0; i<n; i++)   
        {  
        System.out.println(arr[i]);  
        }  

        TreeSet<Integer> unique = new TreeSet<Integer>();
        for (int x : arr) {
            if (!unique.add(x)) {
                System.out.println("Duplicate Elements are : " + x);
            }
            else{
                System.out.println("No Duplicate elemets are found!");
            }
        }
        sc.close();
    }
}
