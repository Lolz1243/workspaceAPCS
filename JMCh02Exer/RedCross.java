// Question 2-13-a

import java.awt.*;
import javax.swing.*;

/**
 * 
This program displays a red cross on a white
 *  background.
 *
 *  @author  Nikhil Vytla
 *  @version Aug 17, 2017
 *  @author  Period: 1
 *  @author  Assignment: JMCh02Exer
 *
 *  @author  Sources: None
 */
public class RedCross extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //   to paint the background
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    g.setColor(Color.RED);
    g.fillRect(xCenter, yCenter - 45 , 10, 100);
    g.fillRect(xCenter - 45, yCenter, 100, 10);
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Red Cross");
    window.setBounds(300, 300, 200, 200);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    RedCross panel = new RedCross();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
  }
}

