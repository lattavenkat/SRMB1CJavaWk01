package com.srm.cjava.wk01.day01;

import java.util.Scanner;
import java.util.logging.Logger;

public class ControlStmt {
    public static final Logger logg = Logger.getLogger(ControlStmt.class.getName());

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        // CONTROL STATEMENT
        logg.info("CONTROL STATEMENT");
        // IF LOOP
        logg.info("IF LOOP");
        logg.info("Enter your age: ");
        int age = scann.nextInt();
        if (age > 18) {
            logg.info("Eligible for voting");
        }
        logg.info("Not eligible for voting");
        // IF ELSE
        logg.info("----------------------------");
        logg.info("IF ELSE");
        if (age > 18) {
            logg.info("Eligible for voting");
        } else {
            logg.info("Not eligible for voting");
        }
        // SWITCH
        logg.info("----------------------------");
        logg.info("SWITCH-Day of the week");
        logg.info("Enter the number(1-7) to retrieve the day:");
        int s = scann.nextInt();
        switch (s) {
            case 1:
                logg.info("MONDAY");
                break;
            case 2:
                logg.info("TUESDAY");
                break;
            case 3:
                logg.info("WEDNESDAY");
                break;
            case 4:
                logg.info("THURSDAY");
                break;
            case 5:
                logg.info("FRIDAY");
                break;
            case 6:
                logg.info("SATURDAY");
                break;
            case 7:
                logg.info("SUNDAY");
                break;
            default:
                logg.info("INVALID NUMBER");
        }
        // NESTED IF
        logg.info("----------------------------");
        logg.info("NESTED IF");
        logg.info("Immunization Vaccine for Babies based on week ");
        logg.info("Enter born week range between 6-24: ");
        int weeks = scann.nextInt();
        if (weeks >= 6 && weeks < 8) {
            logg.info("PCV (Pneumococcal conjugate vaccine) Dose 1");
        }
        if (weeks >= 10 && weeks <= 16) {
            logg.info("Pneumococcal conjugate vaccine Dose 2 ");
        }
        if (weeks >= 14 && weeks <= 24) {
            logg.info("PCV Dose 3");
        } else {
            logg.info("INVALID WEEK");
        }

        // LOOPING
        // DO WHILE AND WHILE LOOP
        logg.info("----------------------------");
        int i = 1;
        logg.info("WHILE / DO WHILE LOOP");
        do {
            i++;
            logg.info("i= " + i);
        } while (i < 5);

        // FOR LOOP
        logg.info("FOR LOOP");
        for (i = 1; i <= 5; i++) {
            logg.info("i= " + i);
        }
        scann.close();
    }
}
