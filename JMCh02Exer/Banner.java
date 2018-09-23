


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 * This applet displays a message moving horizontally 
 * across the screen.
 *
 * @author nvytla071
 * @version Aug 21, 2017
 * @author Period: 1
 * @author Assignment: JMCh02Exer
 *
 * @author Sources: None
 */

public class Banner extends JApplet implements ActionListener
{
    private int xPos, yPos; // hold the coordinates of the banner


    /**
     * creates the content pane and initializes the clock
     */
    public void init()
    {
        Container c = getContentPane();
        c.setBackground( Color.WHITE );
        xPos = c.getWidth();
        yPos = c.getHeight() / 2;
        Timer clock = new Timer( 30, this ); // fires every 30 milliseconds
        clock.start();
    }



    /**
     * Called automatically after a repaint request
     */
    public void paint( Graphics g )
    {
        super.paint( g );
        g.fillRect( xPos, yPos, 40, 30 );
    }



    /**
     * Called automatically when the timer fires
     */
    public void actionPerformed( ActionEvent e )
    {
        Container c = getContentPane();

        // Adjust the horizontal position of the banner:
        xPos++;
        if ( xPos < -100 )
        {
            xPos = c.getWidth();
        }

        // Set the vertical position of the banner:
        yPos = c.getHeight() / 2;

        repaint();
    }
}
