package com.srm.cjava.wk03.day15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ColorMixerSb extends JFrame implements AdjustmentListener {

	JScrollBar redbar;
	JScrollBar greenbar;
	JScrollBar bluebar;
	int cr = 10;
	int cg = 10;
	int cb = 10;

	ColorMixerSb() {
		super("SCROLLBAR DEMO");
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		redbar = new JScrollBar(JScrollBar.HORIZONTAL);
		greenbar = new JScrollBar(JScrollBar.HORIZONTAL);
		bluebar = new JScrollBar(JScrollBar.HORIZONTAL);
		add(redbar);
		add(greenbar);
		add(bluebar);
		redbar.addAdjustmentListener(this);
		greenbar.addAdjustmentListener(this);
		bluebar.addAdjustmentListener(this);
	}

	public void adjustmentValueChanged(AdjustmentEvent e) {

		if (e.getSource() == redbar)
			cr = e.getValue();
		else if (e.getSource() == greenbar)
			cg = e.getValue();
		else if (e.getSource() == bluebar)
			cb = e.getValue();
		System.out.println(cr + ":" + cg + ":" + cb);

		// add color to content pane
		this.getContentPane().setBackground(new Color(cr, cg, cb));
	}

	public static void main(String args[])
    {
        ColorMixerSb obj=new ColorMixerSb();  
    }
}