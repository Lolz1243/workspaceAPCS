
import java.awt.*;
import javax.swing.*;


/**
 * 
 * This applet shows a string of text inside a box.
 * 
 * @author nvytla071
 * @version Aug 21, 2017
 * @author Period: 1
 * @author Assignment: JMCh02Exer
 *
 * @author Sources: None
 */

/**
 * Main class holds all the methods needed for
 * drawing the text inside the box
 */
public class HelloApplet extends JApplet
{
    public void init()
    {
        Container c = getContentPane();
        c.setBackground( Color.WHITE );
    }


    public void paint( Graphics g )
    {
        super.paint( g ); // call JApplet's paint method
                          // to paint the background
        g.setColor( Color.BLUE );
        g.fillRect( 25, 40, 150, 45 ); // draw a rectangle 150 by 45
        g.setColor( Color.WHITE );
        g.drawString( "Hello, Applet!", 60, 65 );
    }
}
