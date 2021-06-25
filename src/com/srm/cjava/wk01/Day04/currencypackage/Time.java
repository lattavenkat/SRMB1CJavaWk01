package com.srm.cjava.wk01.Day04.currencypackage;

import java.util.Scanner;

public class Time {
    int hours;
    int seconds;
    int minutes;
    int seconds2;
    Scanner sc = new Scanner(System.in);

    public void hoursTominutes() {
        System.out.println("Enter the number of hours");
        hours = sc.nextInt();
        minutes = (hours * 60);
        System.out.println("-----------------------------------------------------");
        System.out.println(hours + " is equal to" + minutes + " Minutes: ");
        System.out.println("-----------------------------------------------------");
    }

    public void hoursToseconds() {
        System.out.println("Enter the number of hours");
        hours = sc.nextInt();
        seconds = (hours * 3600);
        System.out.println("-----------------------------------------------------");
        System.out.println(hours + " is equal to" + seconds + " Seconds: ");
        System.out.println("-----------------------------------------------------");
    }

    public void secondsTohours() {
        System.out.print("Enter the number of seconds: ");
        seconds2 = sc.nextInt();
        hours = seconds2 / 3600;
        minutes = (seconds2 % 3600) / 60;
        seconds2 = (seconds2 % 3600) % 60;
        System.out.println("-----------------------------------------------------");
        System.out.println(seconds2+ " is equal to "+ hours+ " hours: " ); 
        System.out.println("-----------------------------------------------------");  
    }

    public void minutesTohours() {
        System.out.print("Enter the number of minutes: ");
        minutes = sc.nextInt();
        hours = minutes / 60;
        minutes = minutes % 60;
        System.out.println("-----------------------------------------------------");
        System.out.println(minutes+ " is equal to "+ hours+ " hours: " );    
        System.out.println("-----------------------------------------------------");
    }
}
