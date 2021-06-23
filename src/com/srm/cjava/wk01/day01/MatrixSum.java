package com.srm.cjava.wk01.day01;

import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        int n;
        int row;
        int col;
        int sum = 0;
        int ri = 0;
        int ci = 0;
        m = sc.nextInt();
        n = sc.nextInt();
        int[] rarr = new int[m];
        int i, j;
        int[][] mat = new int[m][n];
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        }

        int z = 0;

        System.out.print("Sum of rows is: ");
        for (row = 0; row < m; row++) {
            sum = 0;
            for (col = 0; col < n; col++) {
                sum += mat[row][col];
            }

            System.out.print(sum + " ");

            rarr[z++] = sum;
        }
        int tr = rarr[0];
        for (i = 1; i < m; i++) {
            if (tr < rarr[i]) {
                tr = rarr[i];
                ri = i;
            }

        }
        System.out.print("\nRow " + ++ri + " has maximum sum ");

        System.out.print("\nSum of columns is ");
        sum = 0;
        int y = 0;
        int[] carr = new int[n];
        for (i = 0; i < n; ++i) {
            sum = 0;
            for (j = 0; j < m; ++j) {
                sum = sum + mat[j][i];
            }
            System.out.print(sum + " ");

            carr[y++] = sum;

        }

        int tc = carr[0];
        for (i = 1; i < n; i++) {
            if (tc < carr[i]) {
                tc = carr[i];
                ci = i;
            }

        }
        System.out.print("nColumn " + ++ci + " has maximum sum ");
    }
}
