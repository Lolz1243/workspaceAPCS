
/**
 * 
 * This applet displays a banner ad with two alternating messages. It utilizes a
 * conditional if statement to accomplish the task.
 *
 * @author nvytla071
 * @version Aug 18, 2017
 * @author Period: 1
 * @author Assignment: JMCh02Exer
 *
 * @author Sources: None
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * This is a class that holds methods for initializing the applet
 */
public class BannerAlt extends JApplet implements ActionListener
{
    private int xPos, yPos; // hold the coordinates of the banner

    private int msgID = 1;

    /**
     * initializese the content pane and the timer
     */
    public void init()
    {
        Container c = getContentPane();
        c.setBackground( Color.WHITE );
        xPos = c.getWidth() / 2 - 30;
        yPos = c.getHeight() / 2;
        Timer clock = new Timer( 2000, this ); // fires every 2000 milliseconds
        clock.start();
    }


    /**
     * Called automatically after a repaint request
     */
    public void paint( Graphics g )
    {
        super.paint( g );

        g.setColor( Color.BLACK );

        if ( msgID == 1 )
        {
            g.drawString( "East or West", xPos, yPos );
        }
        else
        {
            g.drawString( "Java is Best", xPos, yPos );
        }
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

        msgID = -msgID;
        repaint();
    }
}
