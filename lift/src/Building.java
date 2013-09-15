import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Building extends JPanel {
  Color color;
  public Building() {
    this(Color.black);
  }
  public Building(Color color) {
    this.color = color;
  }
  public void paintComponent(Graphics g) {
    int width = getWidth();
    int height = getHeight();
    g.setColor(color);
    g.drawRect(0, 0, width, height);
  }
  public static void main(String args[]) {
    JFrame frame = new JFrame("Rectangle Sample");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new GridLayout(15, 4));
    Color colors[] = { Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW};
      for (int i = 15; i > 0; i--) {
      Building panel = new Building(colors[i]);
      panel.add(new JButton("Floor " + i));
      frame.add(panel);
    }
    frame.setSize(300, 200);
    frame.setVisible(true);
 
  }
}

