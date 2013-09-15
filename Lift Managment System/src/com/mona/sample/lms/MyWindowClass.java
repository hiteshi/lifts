package com.mona.sample.lms;

import javax.swing.JFrame;

public class MyWindowClass {

	public JFrame jFrame;
	Building building, building2;

	public MyWindowClass() {
		showWindow();
		// showpanel();
		showSplash();
	}

	private void showWindow() {
		jFrame = new JFrame("Lift Management System");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
		jFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

	public void showSplash() {
		new SplashScreen(this).start();
	}

	public void showpanel() {
		building = new Building();
		jFrame.add(building);
	}

}
