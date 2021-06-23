package com.srm.cjava.wk01.day01;

import java.util.logging.Logger;

public class Arrays {
    public static final Logger logg = Logger.getLogger(Arrays.class.getName());

    public static void main(String[] args) {
        // SINGLE DIMESNSIONAL ARRAY
        logg.info("SINGLE DIMESNSIONAL ARRAY");
        int[] arr = new int[10];
        logg.info("ARRAY LENGTH IS: " + arr.length);

        // TWO DIMESNSIONAL ARRAY
        logg.info("TWO DIMESNSIONAL ARRAY");
        int[][] arr1 = { { 1, 2 }, { 4, 5 } };
        logg.info("Element present in 0th row and 1st column is: " + arr1[0][1]);

        // MULTI DIMESNSIONAL ARRAY
        logg.info("MULTI DIMESNSIONAL ARRAY");
        int[][][] arr3 = { { { 1, 7 }, { 2, 5 } }, { { 4, 2 }, { 7, 7 } } };

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                for (int k = 0; k < 2; k++) {

                    System.out.print(arr3[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
