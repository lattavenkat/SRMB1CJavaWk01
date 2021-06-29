package com.srm.cjava.wk01.day04.currencypackage;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        int ch;
        Currency ob1 = new Currency();
        Distance ob2 = new Distance();
        Time ob3 = new Time();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-----CURRENCY-----");
            System.out.println("1.dollar To Rupee ");
            System.out.println("2.Rupee To dollar ");
            System.out.println("3.Euro To Rupee ");
            System.out.println("4.Rupee To Euro ");
            System.out.println("5.Yen To rupee ");
            System.out.println("6.Rupee To Yen ");
            System.out.println("-----DISTANCE-----");
            System.out.println("7.Meter To kilometer ");
            System.out.println("8.Kilometer To meter ");
            System.out.println("9.Miles To kilometer ");
            System.out.println("10.kilometer To miles");
            System.out.println("-----TIME-----");
            System.out.println("11.Hours To Minutes");
            System.out.println("12.Hours To Seconds");
            System.out.println("13.Seconds To Hours");
            System.out.println("14.Minutes To Hours");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
       
        switch (ch) {
            case 1: {
                ob1.dollarToInr();
                break;
            }
            case 2: {
                ob1.inrTodollar();
                break;
            }
            case 3: {
                ob1.euroToInr();
                break;
            }
            case 4: {
                ob1.inrToeuro();
                break;
            }
            case 5: {
                ob1.yenToInr();
                break;
            }
            case 6: {
                ob1.inrToYen();
                break;
            }
            case 7: {
                ob2.mtrTokm();
                break;
            }
            case 8: {
                ob2.kmTomtr();
                break;
            }
            case 9: {
                ob2.milesTokm();
                break;
            }
            case 10: {
                ob2.kmTomiles();
                break;
            }
            case 11: {
                ob3.hoursTominutes();
                break;
            }
            case 12: {
                ob3.hoursToseconds();
                break;
            }
            case 13: {
                ob3.secondsTohours();
                break;
            }
            case 14: {
                ob3.minutesTohours();
                break;
            }
            default: {
                System.out.println("INVALID NUMBER");
            }
        } 
    } while (ch >= 1 && ch <= 14);
    sc.close();
  }
}
