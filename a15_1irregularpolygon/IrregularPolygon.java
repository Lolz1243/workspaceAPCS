import java.awt.Color;
import java.awt.geom.*;
import java.util.*;
import gpdraw.*;

/**
 * TODO Write a one-sentence summary of your class here.
 * TODO Follow it with additional details about its purpose, what abstraction
 * it represents, and how to use it.
 *
 * @author  Nikhil Vytla
 * @version 10/31/17
 *
 * @author  Period - 1
 * @author  Assignment - A15_1IrregularPolygon
 * 
 * @author  Sources - None
 */
public class IrregularPolygon
{
    private DrawingTool pen = new DrawingTool( new SketchPad( 300, 300, 0 ) );
    private ArrayList<Point2D.Double> myPolygon;

    //constructors
    
    public IrregularPolygon()
    {
        myPolygon = new ArrayList<Point2D.Double>();
    }

    // public methods

    public void add( Point2D.Double aPoint )
    {
        myPolygon.add( aPoint );
    }

    public double perimeter()
    {
        return 0.0;  //fix this!
    }

    public double area()
    {
        return 0.0; //fix this!
    }

    public void draw()
    {
        
    }
}
