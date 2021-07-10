package com.srm.cjava.wk03.day17;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JTabbedPane;

public class Tabbedex {

    JFrame f;

    Tabbedex() {

        f = new JFrame("Tabbed Pane Sample");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        tabbedPane.setTabPlacement(JTabbedPane.TOP);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        tabbedPane.setBounds(50, 50, 200, 200);
        tabbedPane.add("One", p1);
        tabbedPane.add("Two", p2);
        tabbedPane.add("Three", p3);
        f.add(tabbedPane, BorderLayout.CENTER);
        f.setSize(400, 150);
        
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new Tabbedex();
    }
}
