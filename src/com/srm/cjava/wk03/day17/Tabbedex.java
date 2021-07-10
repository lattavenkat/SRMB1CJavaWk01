package com.srm.cjava.wk03.day17;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JTabbedPane;

public class Tabbedex {

    JFrame frame;

    Tabbedex() {

        frame = new JFrame("Tabbed Pane Sample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        frame.add(tabbedPane, BorderLayout.CENTER);
        frame.setSize(400, 150);
        frame.setVisible(true);
    }

    public static void main(String args[]) {
        new Tabbedex();
    }
}
