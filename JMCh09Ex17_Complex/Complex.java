/**
 * Represents a complex number of the form a + bi. Provides methods for
 * adding, multiplying and calculating the absolute value.
 *
 *  @author  Nikhil Vytla
 *  @version 9/29/17
 *  @author  Period: 1
 *  @author  Assignment: JMCh09Ex17_Complex 
 *
 *  @author  Sources: None
 */
public class Complex
{

    private double a;
    private double b;
  
    public Complex (double a)
    {
        this.a = a;
        this.b = 0.0;
    }
    
    public Complex (double a, double b)
    {
        this.a = a;
        this.b = b;
    }
  
    public double abs()
    {
        return Math.sqrt( a*a + b*b );
    }
    
    public Complex add(Complex other)
    {
        double c = this.a + other.a;
        double d = this.b + other.b;
        
        return new Complex (c, d);
    }

    public Complex add(double a)
    {
        double b = this.a + a;
        
        return new Complex (b);
    }
    
    public Complex multiply(Complex other)
    {
        double c = this.a * other.a - this.b * other.b;
        double d = this.a * other.b + this.b * other.a;
        
        return new Complex (c, d);
    }
    
    public Complex multiply(double a)
    {
        double c = this.a * a;
        
        return new Complex (c);
    }

    public String toString()
    {
        return a + " + " + b + "i";
    }
}
