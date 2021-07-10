package com.srm.cjava.wk03.day14;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Palindrome implements ActionListener {
    Button bt;
    TextField tf;
    Label l1, l2;
    Frame f;

    Palindrome() {
        f = new Frame("Check palindrome");

        l1 = new Label("Check Palindrome");
        l1.setBounds(5, 50, 150, 30);
        f.add(l1);

        tf = new TextField();
        tf.setBounds(200, 50, 150, 30);
        f.add(tf);

        l2 = new Label();
        l2.setBounds(90, 140, 150, 30);
        f.add(l2);

        bt = new Button("Submit ");
        bt.setBounds(90, 200, 100, 30);
        f.add(bt);

        bt.addActionListener(this);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
     
        f.setLayout(null);
        f.setSize(600, 500);
        f.setVisible(true);
        f.setBackground(Color.GRAY);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String str = tf.getText();
        String rev = "";
        int length = str.length();

        for (int i = length - 1; i >= 0; i--)
            rev = rev + str.charAt(i);

        if (str.equals(rev))
            l2.setText(str + " is a palindrome");
        else
            l2.setText(str + "is not a palindrome");

    }

    public static void main(String args[]) {
        Palindrome p = new Palindrome();
        System.out.println(p);
    }

}