import java.awt.*;
import javax.swing.*;

/**
 * This program draws an ornament of nested triangles
 * 
 * @author Nikhil Vytla
 * @version 9/13/17
 * 
 * @author Period - 1
 * @author Assignment - Ch04 Ex4-16 Ornament
 * 
 * @author Sources - None
 */
public class Ornament extends JPanel
{
    /**
     * paints the triangle using the method drawTriangles.
     * @param g - java graphics from package.
     */
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g ); // Call JPanel's paintComponent method
                                   // to paint the background
        drawTriangles( g, 100, 80, 64 );
    }


    /**
     * 
     * Draws an ornament made of triangles in Graphics g with the base midpoint
     * at (x, y) and base half-length r
     * 
     * @param g
     *            - is graphics from package
     * @param x
     *            - x coordinate of base midpoint
     * @param y
     *            - y coordinate of base midpoint
     * @param r
     *            - half-length of base.
     */
    public void drawTriangles( Graphics g, int x, int y, int r )
    {
        if ( r == 2 )
        {
            return;
        }

        else
        {
            g.drawLine( x + r, y, x, y - r ); // (top right)
            g.drawLine( x + r, y, x - r, y ); // (bottom)
            g.drawLine( x - r, y, x, y - r ); // (top left)
            r = r / 2;
            x = x + r;
            y = y + r;

            drawTriangles( g, x, y - r, r );
            x -= r;
            y -= r;
            drawTriangles( g, x - r, y, r );
        }

    }

    /**
     * 
     * main method instantiates the jframe, sets the 
     * background, and set the bounds.
     * @param args all arguments passed through the main.
     */
    public static void main( String[] args )
    {
        JFrame w = new JFrame( "Triangles" );
        w.setBounds( 300, 300, 200, 120 );
        w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        Ornament panel = new Ornament();
        panel.setBackground( Color.WHITE );
        Container c = w.getContentPane();
        c.add( panel );
        w.setResizable( false );
        w.setVisible( true );
    }
}

