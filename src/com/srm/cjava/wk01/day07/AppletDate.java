package com.srm.cjava.wk01.day07;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Calendar;
import java.util.Date;

public class AppletDate extends Applet implements Runnable {
    Date date;

    public void init() {
        setBackground(Color.lightGray);

        setSize(1000, 300);
    }

    @Override
    public void start() {
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (true) {
            date = new Date();
            repaint();
        }
        
    }

    @Override
    public void paint(Graphics g) {

        g.setColor(Color.WHITE);
        g.drawString(date.toString(), 200, 100);
        Calendar cal = Calendar.getInstance();
        int hours = cal.get(Calendar.HOUR_OF_DAY);
        if (hours > 12)
            hours -= 12;
        int minutes = cal.get(Calendar.MINUTE);
        int seconds = cal.get(Calendar.SECOND);
    }
}
