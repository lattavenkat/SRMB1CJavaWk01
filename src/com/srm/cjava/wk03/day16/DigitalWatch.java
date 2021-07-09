package com.srm.cjava.wk03.day16;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DigitalWatch implements Runnable {
    JFrame f;
    Thread t = null;
    int hours = 0, minutes = 0, seconds = 0;
    String timeString = "";
    JButton b;

    DigitalWatch() {
        f = new JFrame();

        t = new Thread(this);
        t.start();

        b = new JButton();
        b.setBounds(60, 100, 100, 50);

        f.add(b);
        f.setBackground(Color.GRAY);
        f.setSize(200, 200);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void run() {
        try {
            while (true) {

                Calendar cal = Calendar.getInstance();
                hours = cal.get(Calendar.HOUR_OF_DAY);
                if (hours > 12)
                    hours -= 12;
                minutes = cal.get(Calendar.MINUTE);
                seconds = cal.get(Calendar.SECOND);

                SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
                Date date = cal.getTime();
                timeString = formatter.format(date);

                printTime();

                t.sleep(2000); 
            }
        } catch (Exception e) {
        }
    }

    public void printTime() {
        b.setText(timeString);
    }

    public static void main(String[] args) {
        new DigitalWatch();
    }

}