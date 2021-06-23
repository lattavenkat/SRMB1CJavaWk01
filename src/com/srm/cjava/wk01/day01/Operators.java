package com.srm.cjava.wk01.day01;

import java.util.Scanner;
import java.util.logging.Logger;

public class Operators {
    public static final Logger logg = Logger.getLogger(Operators.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        logg.fine("Enter the number: ");
        int n1 = sc.nextInt();
        int n2 = 10;
        int n3 = 5;
        logg.fine("Unary Operator, POST FIX INCREAMENT: " + n1++);
        logg.fine("Unary Operator, POST FIX AFTER INCREAMENT " + n1++);
        logg.fine("Unary Operator, PRE FIX INCREAMENT: " + ++n1);
        logg.fine("Unary Operator, POST FIX DECREAMENT: " + n1--);
        logg.fine("Unary Operator, PRE FIX DECREAMENT: " + n1);
        logg.fine("Unary Operator, PRE FIX DECREAMENT" + --n1);
        logg.fine("----------------------------------------------");
        logg.fine("Arithmetic Operator, SUM: " + (n2 + n3));
        logg.fine("Arithmetic Operator, SUBTRACTION: " + (n2 - n3));
        logg.fine("Arithmetic Operator, MULTIPLICATION: " + (n2 * n3));
        logg.fine("Arithmetic Operator, DIVISION: " + (n2 / n3));
        sc.close();
    }
}
