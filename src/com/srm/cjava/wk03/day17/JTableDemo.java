package com.srm.cjava.wk03.day17;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableDemo {

    JFrame f;

    JTable jt;
    static JComboBox c;

    JTableDemo() {

        f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("JTable Sample");
        String[][] d = { { "Sam", "29", "Dream Land" }, { "Anna`", " 27 ", "Happy Place" },
                { "Nohh", " 4 ", "NOrthan way" }, };
        String[] cn = { "Name", "Age", "Address" };
        jt = new JTable(d, cn);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane jsp = new JScrollPane(jt);
        f.add(jsp);
        f.setSize(500, 200);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new JTableDemo();
    }
}