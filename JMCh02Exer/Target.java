/**
 * 
 * This program draws a target symbol.
 * It uses the fillOval method from the Graphics class.
 *
 *  @author  Nikhil Vytla
 *  @version Aug 18, 2017
 *  @author  Period: 1
 *  @author  Assignment: JMCh02Exer
 *
 *  @author  Sources: None
 */

import java.awt.*;
import javax.swing.*;

public class Target extends JPanel
{
    public void paintComponent(Graphics g)
    {
      super.paintComponent(g);  // Call JPanel's paintComponent method
                                //   to paint the background
      int xCenter = getWidth() / 2;
      int yCenter = getHeight() / 2;
      
      g.setColor( Color.RED );
      g.fillOval( xCenter-30, yCenter-30, 60, 60 );
      g.setColor( Color.WHITE );
      g.fillOval( xCenter-18, yCenter-18, 36, 36 );
      g.setColor(Color.RED);
      g.fillOval( xCenter-6, yCenter-6, 12, 12 );

    }

    public static void main(String[] args)
    {
      JFrame window = new JFrame("Target");
      window.setBounds(300, 300, 200, 200);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Target panel = new Target();
      panel.setBackground(Color.WHITE);
      Container c = window.getContentPane();
      c.add(panel);
      window.setVisible(true);
    }
}
