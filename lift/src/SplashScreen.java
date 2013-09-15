/*import javax.swing.*;
import java.awt.*;
import java.awt.Color;
class SplashScreen{
	public void showScreen() {
		JPanel panel = new JPanel("Lift Management System");
		panel.setBackground(BLACK);
		//super("Fullscreen");
		getContentPane().setPreferredSize( Toolkit.getDefaultToolkit().getScreenSize());
		pack();
		setResizable(false);
		show();
		SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				Point p = new Point(0, 0);
				SwingUtilities.convertPointToScreen(p, getContentPane());
				Point l = getLocation();
				l.x -= p.x;
				l.y -= p.y;
				setLocation(l);
			}
		}	);
  }
	
}*/
import javax.swing.JWindow;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
public class SplashScreen extends JWindow
{
 
Image img=Toolkit.getDefaultToolkit().getImage("splash.png");
 
ImageIcon imgicon=new ImageIcon(img);
public static void main(String[]args)
{
SplashScreen sp=new SplashScreen();
}

public SplashScreen()
{
try
{
     
setSize(633,300);
setLocationRelativeTo(null);
show();
Thread.sleep(5000);
dispose();
javax.swing.JOptionPane.showMessageDialog((java.awt.Component)
        null,"Welcome", "Welcome Screen:",
        javax.swing.JOptionPane.DEFAULT_OPTION);
}
catch(Exception exception)
{
       javax.swing.JOptionPane.showMessageDialog((java.awt.Component)
               null,"Error"+exception.getMessage(), "Error:",
               javax.swing.JOptionPane.DEFAULT_OPTION);
}
}


public void paint(Graphics g)
{
g.drawImage(img,0,0,this);
}
}


