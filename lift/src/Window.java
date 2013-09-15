import javax.swing.JPanel;  
import javax.swing.JFrame;  
import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

class Window {
	JFrame jfrm;
	public Window() 
	{
		showWindow();
		showpanel();
							
	}
	
			
	void showWindow() {
		jfrm = new JFrame("Lift Management System");
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfrm.setVisible(true);
		jfrm.setExtendedState(JFrame.MAXIMIZED_BOTH); 
	}
	void showpanel() {
		JFrame frame = new JFrame();  
		JPanel panel = new JPanel();
		Color color=new Color(192,192,192); 
		Color color2=new Color(192,192,192); 		
		Font font = new Font("serif", Font.BOLD, 38);
		Font font2 = new Font("TimesRoman",Font.ITALIC,20);
		JButton button = new JButton("Lift Management System");
		JButton button2 = new JButton("By-Hiteshi Sharma");
		button.setBackground(color);
		button.setFont(font);
		button2.setBackground(color2);
		button2.setFont(font2);
		jfrm.getContentPane().add(BorderLayout.CENTER,button);
		jfrm.getContentPane().add(BorderLayout.SOUTH,button2);
	}
}
