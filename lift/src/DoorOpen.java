import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DoorOpen extends JFrame
{
	//inner Class
	public class MyJPanel extends JPanel
	{
	    public int x 	= 150;	//Start Drawing from X=10	
	    public int y 	= 150;
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
		g.fillRect(x,10,100,400);

		g.setColor(Color.red);
		g.fillRect(y,10,100,400);
		
		
	    }
	
	}

	public static void main(String args [])
	{	      
	  new DoorOpen ();		
	}

	DoorOpen ()
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

