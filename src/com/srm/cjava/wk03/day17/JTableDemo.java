package com.srm.cjava.wk03.day17;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableDemo {

    JFrame fr;

    JTable jt;
    static JComboBox c;

    JTableDemo() {

        fr = new JFrame();

        fr.setTitle("JTable Sample");
        String[][] d = { { "Sam", "29", "Dream Land" }, { "Anna`", " 27 ", "Happy Place" },
                { "Nohh", " 4 ", "NOrthan way" }, };
        String[] cn = { "Name", "Age", "House Address" };
        jt = new JTable(d, cn);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane jsp = new JScrollPane(jt);
        fr.add(jsp);
        fr.setSize(500, 200);
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new JTableDemo();
    }
}