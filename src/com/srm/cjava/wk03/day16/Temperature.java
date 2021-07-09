package com.srm.cjava.wk03.day16;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Temperature  extends JFrame
{
    private JLabel celsiusLabel;        
    private JLabel fahrenheitLabel;
     
    private JTextField celsiusTF;       
    private JTextField fahrenheitTF;    
     
    private CelsHandler celsiusHandler;
    private FahrHandler fahrenheitHandler;
     
    private static final int WIDTH = 500;
    private static final int HEIGHT = 300;   
    private static final double FTOC = 5.0/9.0;
    private static final double CTOF = 9.0/5.0;
    private static final int OFFSET = 32;
     
    public Temperature()
    {
        setTitle("Temperature Conversion");
        Container c = getContentPane();
        c.setLayout(new GridLayout(1,4));
         
        celsiusLabel = new JLabel("Temp in Celsius: ",
                                            SwingConstants.RIGHT);
        fahrenheitLabel = new JLabel("Temp in Fahrenheit: ",
                                            SwingConstants.RIGHT);
                                             
        celsiusTF = new JTextField(7);
        fahrenheitTF = new JTextField(7);
         
        c.add(celsiusLabel);
        c.add(celsiusTF);
        c.add(fahrenheitLabel);
        c.add(fahrenheitTF);
         
        celsiusHandler = new CelsHandler();
        fahrenheitHandler = new FahrHandler();
         
        celsiusTF.addActionListener(celsiusHandler);
        fahrenheitTF.addActionListener(fahrenheitHandler);
         
        setSize (WIDTH, HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
     
    private class CelsHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double celsius, fahrenheit;
             
            celsius =
                    Double.parseDouble(celsiusTF.getText());
            fahrenheit = celsius * CTOF + OFFSET;
            fahrenheitTF.setText(String.format("%.2f", fahrenheit));
        }
    }
     
    private class FahrHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double celsius, fahrenheit;
            fahrenheit = 
                    Double.parseDouble(fahrenheitTF.getText());
            celsius = (fahrenheit - OFFSET) * FTOC;
            celsiusTF.setText(String.format("%.2f", celsius));
        }
    }
             
     
    public static void main(String[] args)
    {
    	Temperature tempConv = new Temperature();
        tempConv.setLocationRelativeTo(null);
    }
}
