package com.mona.sample.lms;

import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;


public class SplashScreen extends Thread{
	MyWindowClass myWindowClass;
	JPanel jPanel;
	ImageIcon image;
	JLabel label;
	JProgressBar bar;
	public SplashScreen(MyWindowClass myWindowClass){
		this.myWindowClass = myWindowClass;
		jPanel = new JPanel();
	    label = new JLabel("Lift Managment");
	    bar = new JProgressBar();
	    bar.setPreferredSize(new Dimension(450,50));
	    jPanel.add(label);
	    jPanel.add(bar);
	    this.myWindowClass.jFrame.add(jPanel);
	}
	
	@Override
	public void run() {
		 for (int i = 0; i <= 100; i++) {
             bar.setValue(i);
             try {

                 sleep(10);
             } catch (InterruptedException ex) {
                 Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
		 jPanel.setVisible(false);
		 System.out.println("kaam ho gaya");
		 this.myWindowClass.showpanel();
		super.run();
	}
}
