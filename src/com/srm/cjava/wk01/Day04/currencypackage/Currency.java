package com.srm.cjava.wk01.day04.currencypackage;

import java.util.Scanner;

public class Currency {
    double dollar;
    double euro;
    double yen;
    double inr;
    Scanner sc = new Scanner(System.in);

    public void dollarToInr() {
        System.out.println("Enter the Dollars to covert into Rupeees: ");
        dollar = sc.nextDouble();
        inr = dollar * 74.16;
        System.out.println("-----------------------------------------------------");
        System.out.println("Indian rupees for $ " + dollar + "is: " + inr);
        System.out.println("-----------------------------------------------------");
    }

    public void inrTodollar() {
        System.out.println("Enter Rupee to convert into Dollars:");
        inr = sc.nextInt();
        dollar = inr / 67;
        System.out.println("-----------------------------------------------------");
        System.out.println("Indian Rupee " + inr + " is equal to " + dollar + " Dollars");
        System.out.println("-----------------------------------------------------");
    }

    public void euroToInr() {
        System.out.println("Enter the Euro to covert into Rupeees: ");
        euro = sc.nextDouble();
        inr = euro * 0.011;
        System.out.println("-----------------------------------------------------");
        System.out.println("Indian rupees for " + dollar + " Euro is: " + inr);
        System.out.println("-----------------------------------------------------");
    }

    public void inrToeuro() {
        System.out.println("Enter in Rupees to convert into Euro:");
        inr = sc.nextInt();
        euro = (inr / 79.50);
        System.out.println("-----------------------------------------------------");
        System.out.println(" Euro for Indian Rupee " + inr + " is: " + euro );
        System.out.println("-----------------------------------------------------");
    }

    public void yenToInr() {
        System.out.println("Enter the Japanese Yen to covert into Rupeees: ");
        yen = sc.nextDouble();
        inr = yen * 0.67;
        System.out.println("-----------------------------------------------------");
        System.out.println("Indian rupees for Japanese Yen " + yen + " is: " + inr);
        System.out.println("-----------------------------------------------------");
    }

    public void inrToYen() {
        System.out.println("Enter the Rupees to covert into Japanese Yen: ");
        inr = sc.nextDouble();
        yen = inr * 1.49;
        System.out.println("-----------------------------------------------------");
        System.out.println("Japanese Yen for Indian Rupees " + inr + " is: " + yen);
        System.out.println("-----------------------------------------------------");
    }
}
