package com.mona.sample.lms;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Building extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Building() {
		setSize(25, 25);
		setBorder(BorderFactory.createLineBorder(Color.red));

		setBackground(Color.cyan);
		setVisible(true);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
	}
}
