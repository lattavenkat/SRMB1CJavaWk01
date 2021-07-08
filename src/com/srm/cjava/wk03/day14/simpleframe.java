package com.srm.cjava.wk03.day14;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class simpleframe {
    public static void main(String[] args) {

        JFrame frame = new JFrame("My first frame");

        JLabel namel = new JLabel("NAME");
        JTextField nametf = new JTextField(15);
        nametf.setBounds(0, 10, 150, 30);
        JLabel passl = new JLabel("PASSWORD");
        JPasswordField passtf = new JPasswordField(15);
        passtf.setBounds(1, 10, 150, 30);
        JButton loginbtn = new JButton("LOGIN");
        final JLabel tf = new JLabel();
        tf.setBounds(50, 50, 150, 20);
        loginbtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                tf.setText("Welcome!");
            }

        });

        JPanel f = new JPanel();
        frame.add(f);
        f.setBackground(Color.CYAN);
        f.add(namel);
        f.add(nametf);
        f.add(passl);
        f.add(passtf);
        f.add(loginbtn);
        f.add(tf);
        frame.setSize(200, 400);
        frame.setVisible(true);
        // setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}