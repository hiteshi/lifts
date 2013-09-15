import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
public class ButtonPanel extends JFrame    
{   
	public static String newline1 = System.getProperty("line.separator");    
    	public ButtonPanel()    
	{    
 		//Set JFrame title    
 		setTitle("Draw A Rectangle In JFrame");    
    
 		//Set default close operation for JFrame    
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    
 		//Set JFrame size    
 		setSize(1500,1500);    
    
 		//Make JFrame visible     
 		setVisible(true);    
	}		    
         
    	public void paint(Graphics g)    
	{    
    		ArrayList <String> classlist=new ArrayList<String>();  
    		classlist.add("1");  
    		classlist.add("2");  
    		classlist.add("3");  
    		classlist.add("4");  
    		classlist.add("5");  
    		classlist.add("6"); 
		classlist.add("7");  
    		classlist.add("8");  
    		classlist.add("9"); 
  		super.paint(g) ;  
  		int b=classlist.size();  
  		int a=(classlist.size())/3;  
  		for(int i=0;i<b;i++)   //a  
        	{      
      			int x=i*150+10;  //i*500+50  
      			int y=200;       //50
      			int w= x+25;      //25  
      			int z=y+25;     //25  
     			String thisclass= classlist.get(i);  
    			//draw rectangle outline  
      			System.out.println(thisclass);  
        		g.drawRect(x,y,100,100);    
        		g.drawString(thisclass,w ,z);  
         	}  
  		/*for(int j=b-1;j>=a;j--)  
                {      
                	int x=j*200+50;  
        		int y=250;  
                        int w=x+25;  
                        int z=y+25;  
                        String thisclass= classlist.get(j);  
                   	//draw rectangle outline  
                        System.out.println(thisclass);  
                   	g.drawRect(x,y,150,100);    
                   	g.drawString(thisclass,w ,z);  
                 }*/  
           	  
        }  
        public static void main(String[]args)    
        {    
              ButtonPanel obj;    
              obj = new ButtonPanel();  
        }    
}   


