package com.srm.cjava.wk01.day04.currencypackage;

import java.util.Scanner;

public class Distance {
    double km;
    double m;
    double mile;
    Scanner sc = new Scanner(System.in);

    public void mtrTokm() {
        System.out.println("Enter in Meter to covert into Kilometer: ");
        m = sc.nextDouble();
        km = m * 0.001;
        System.out.println("-----------------------------------------------------");
        System.out.println(+m + " meter is equal to " + km + " Kilometer");
        System.out.println("-----------------------------------------------------");
    }

    public void kmTomtr() {
        System.out.print("Enter in Kilometer to covert into Meter: ");
        km = sc.nextDouble();
        m = (km * 1000);
        System.out.println("-----------------------------------------------------");
        System.out.println(km + "km" + "equal to" + m + "metres");
        System.out.println("-----------------------------------------------------");
    }

    public void milesTokm() {
        System.out.println("Enter in Miles to covert into Kilometer: ");
        mile = sc.nextDouble();
        km = mile * 1.60934;
        System.out.println("-----------------------------------------------------");
        System.out.println(+mile + " meter is equal to " + km + " Kilometer");
        System.out.println("-----------------------------------------------------");
    }

    public void kmTomiles() {
        System.out.println("Enter in Kilometer to covert into Miles: ");
        m = sc.nextDouble();
        mile = km * 0.621371;
        System.out.println("-----------------------------------------------------");
        System.out.println(+km + " meter is equal to " + mile + " Kilometer");
        System.out.println("-----------------------------------------------------");
    }
}
