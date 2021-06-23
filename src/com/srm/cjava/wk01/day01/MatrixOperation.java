package com.srm.cjava.wk01.day01;

import java.util.Scanner;
import java.util.logging.Logger;

public class MatrixOperation {
    static Logger logg = Logger.getLogger(MatrixOperation.class.getName());

    public static void main(String[] args) {
        // MatrixOperation
        Scanner sc = new Scanner(System.in);

        int row;
        int col;
        int i;
        int j;

        logg.info("ADDITION OF TWO MATRIX\n");
        logg.info("----------------------");
        logg.info("Enter the number of rows: ");
        row = sc.nextInt();

        logg.info("Enter the number columns: ");
        col = sc.nextInt();

        int mat1[][] = new int[row][col];
        int mat2[][] = new int[row][col];
        int res[][] = new int[row][col];

        logg.info("Enter the elements of matrix1");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {

                mat1[i][j] = sc.nextInt();
                System.out.println(" ");
            }
        }
        logg.info("Enter the elements of matrix2");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {

                mat2[i][j] = sc.nextInt();
                System.out.println(" ");
            }
        }
        // MATRIX ADDITION
        logg.info("Matrix Sum : \n");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                res[i][j] = mat1[i][j] + mat2[i][j];
                System.out.println(" " + res[i][j] + "\t");
            }
            System.out.println(" ");
        }
        // MATRIX MULTIPLICATION
        logg.info("Matrix MULTIPLICATION : \n");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                res[i][j] = mat1[i][j] * mat2[i][j];
                System.out.println(" " + res[i][j] + "\t");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
