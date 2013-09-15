import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MoveLift extends JFrame
{
	//inner Class
	public class MyJPanel extends JPanel
	{
	    public int x 	= 10;	//Start Drawing from X=10	
	    public int y 	= 300;
	    public int delay 	= 50; 	//milliseconds
	    MyJPanel()
	    {
		 ActionListener counter = new ActionListener() {
			public void actionPerformed(ActionEvent evt) 
			{ 
			      repaint();
			      x++;
			      y--;	
			}};
		 new Timer(delay, counter).start();
	    }

	    public void paintComponent(Graphics g)
	    {
		super.paintComponent(g);

		g.setColor(Color.cyan);
		g.fillRect(100,x,50,50);

		g.setColor(Color.red);
		g.fillRect(300,y,50,50);
		
		
	    }
	
	}

	public static void main(String args [])
	{	      
	  new MoveLift ();		
	}

	MoveLift ()
	{
	    Container container = getContentPane();
	    MyJPanel panel = new MyJPanel();
	    container.add(panel);	  
	    
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setSize(400,400);
	    setTitle("JPanel Draw Rect Animation");
	    setVisible(true);
	}
}

