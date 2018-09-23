import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

import javax.swing.*;


public class BugRunner
    extends JFrame implements ActionListener
    {

    private int time;


    public BugRunner()
    {
     super("BugRunner");
     time = 0;
     Timer clock = new Timer(30, this);
     clock.start();
     }



     public void paint(Graphics g)
     {
         int x = 150 - (int)(100 * Math.cos(0.005 * Math.PI * time));
         int y = 150 - (int)(75 * Math.sin(0.005 * Math.PI * time));
         int r = 20;

         Color sky;
         if (y > 150) sky = Color.BLACK;
         else sky = Color.CYAN;
         Container c = getContentPane();
         c.setBackground(sky);
         super.paint(g);

         g.setColor(Color.ORANGE);
         g.fillOval(x - r, y - r, 2*r, 2*r);
     }


    public void actionPerformed( ActionEvent e )
    {
        time++;
        repaint();
    }


    public static void main( String args )
    {
        BugRunner w = new BugRunner();
        w.setSize( 300, 150 );
        w.setDefaultCloseOperation( EXIT_ON_CLOSE );
        w.setResizable( false );
        w.setVisible( true );
    }
}