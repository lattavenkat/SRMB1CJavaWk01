package com.srm.cjava.wk03.day17;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class ComboBoxDemo extends JFrame implements ItemListener {
    static JFrame f;
    static JLabel a, b;
    static JComboBox c;

    public static void main(String[] args) {
        f = new JFrame("frame");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ComboBoxDemo st = new ComboBoxDemo();
        f.setLayout(new FlowLayout());
        String str[] = { "Iron Man", "Captain America", "Black Panther", "Black Widow", "Spider Man Home Coming" };
        c = new JComboBox(str);
        c.addItemListener(st);
        a = new JLabel("select the movie to binge ");
        b = new JLabel("Iron Man is Selected");
        a.setForeground(Color.red);
        b.setForeground(Color.blue);
        JPanel pa = new JPanel();
        pa.add(a);
        pa.add(c);
        pa.add(b);
        f.add(pa);
        f.setSize(700, 700);

        f.show();

    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == c) {
            b.setText(c.getSelectedItem() + "is Selected");
        }
    }
}