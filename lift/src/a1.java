import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class a1 extends JFrame
{
	//inner Class
	public class MyJPanel extends JPanel
	{
	    public int x 	= 0;	//Start Drawing from X=10	
	    public int y 	= 500;
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
		g.fillRect(x,100,x,400);

		g.setColor(Color.red);
		g.fillRect(y,100,y,400);
		
		
	    }
	
	}

	public static void main(String args [])
	{	      
	  new a1 ();		
	}

	a1 ()
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

