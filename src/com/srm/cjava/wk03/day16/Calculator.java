package com.srm.cjava.wk03.day16;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener {
	JFrame frame;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bd, be, bf, bg, bh, b0, Clear;
    JTextArea ta;
    String Textcontent = "", sum = "";
    double result = 0;

    public static void main(String[] args) {
        Calculator cl = new Calculator();
        cl.go();
    }

    public void go() {
        frame = new JFrame("G Calculator");
        ta = new JTextArea(1, 20);
        ta.setBackground(Color.lightGray);
        JPanel cp = new JPanel();
        cp.setLayout(new GridLayout(4, 4, 5, 5));
        JPanel c = new JPanel();
        c.setLayout(new GridLayout(1, 2, 5, 5));
        b0 = new JButton("0");
        b0.addActionListener(this);

        b1 = new JButton("1");
        b1.addActionListener(this);

        b2 = new JButton("2");
        b2.addActionListener(this);

        b3 = new JButton("3");
        b3.addActionListener(this);

        b4 = new JButton("4");
        b4.addActionListener(this);

        b5 = new JButton("5");
        b5.addActionListener(this);

        b6 = new JButton("6");
        b6.addActionListener(this);

        b7 = new JButton("7");
        b7.addActionListener(this);

        b8 = new JButton("8");
        b8.addActionListener(this);

        b9 = new JButton("9");
        b9.addActionListener(this);

        ba = new JButton(".");
        ba.addActionListener(this);

        bd = new JButton("+");
        bd.addActionListener(this);

        be = new JButton("-");
        be.addActionListener(this);

        bf = new JButton("×");
        bf.addActionListener(this);

        bg = new JButton("/");
        bg.addActionListener(this);

        bh = new JButton("=");
        bh.addActionListener(this);

        Clear = new JButton("Clear");
        Clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Textcontent = "";
                result = 0;
                sum = "";
                ta.setText("");
            }
        });

        c.add(ta);
        c.add(Clear);
        c.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        cp.add(b7);
        cp.add(b8);
        cp.add(b9);
        cp.add(bd);
        cp.add(b4);
        cp.add(b5);
        cp.add(b6);
        cp.add(be);
        cp.add(b1);
        cp.add(b2);
        cp.add(b3);
        cp.add(bf);
        cp.add(b0);
        cp.add(ba);
        cp.add(bh);
        cp.add(bg);
        cp.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        Container f = frame.getContentPane();
        f.add(c, BorderLayout.NORTH);
        f.add(cp, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String content = e.getActionCommand();
        ta.append(e.getActionCommand());
        getTextContent(content);
    }

    public void getTextContent(String content) {
        if (content.equals("+") || content.equals("-") || content.equals("×") || content.equals("/")) {
            Textcontent = Textcontent + " " + content + " ";
        } else if (content.equals("=")) {
            Textcontent = Textcontent + " " + content;
            sum = GetResult(Textcontent);
        } else {
            Textcontent = Textcontent + content;
        }
        ta.append(sum);
    }

    public String GetResult(String Textcontent) {
        String n = Textcontent;
        String[] content = n.split(" ");
        result = Double.valueOf(content[0]);
        for (int i = 1; i < content.length; i++) {
            switch (content[i]) {
                case "+":
                    result = result + Double.valueOf(content[i + 1]);
                    break;
                case "-":
                    result = result - Double.valueOf(content[i + 1]);
                    break;
                case "×":
                    result = result * Double.valueOf(content[i + 1]);
                    break;
                case "/":
                    result = result / Double.valueOf(content[i + 1]);
                    break;
                case "=":
                    break;
            }
        }
        return result + "";
    }

}