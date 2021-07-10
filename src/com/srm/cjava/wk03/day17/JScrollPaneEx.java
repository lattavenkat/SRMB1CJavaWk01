package com.srm.cjava.wk03.day17;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JScrollPaneEx {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JTextArea tArea = new JTextArea(10, 10);
        JScrollPane scrollPane = new JScrollPane(tArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel.add(scrollPane);
        frame.setContentPane(panel);
        frame.setSize(500, 500);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }
}