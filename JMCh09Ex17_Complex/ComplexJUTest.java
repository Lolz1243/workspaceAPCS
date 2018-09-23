import org.junit.*;

import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;

/**
 *  Test for the complex number class.
 *  
 *  testConstructor1Param - test the 1 parameter constructor
 *  testConstructor2Param - test the 2 parameter constructor
 *  testAddRealAndComplexNum - addition of a complex number 
 *     with a real number
 *  testAdd2ComplexNums - addition of two complex numbers
 *  testMultiply2ComplexNums - multiplication of two complex numbers
 *  testMultiplyRealAndComplexNum - multiplication of a complex number
 *     with a real number
 *  testAbsoluteValue - absolute value of a complex number
 *
 *  @author  Nikhil Vytla
 *  @version 9/29/17
 *  @author  Period: 1
 *  @author  Assignment: JMCh09Ex17_Complex 
 *
 *  @author  Sources: None
 */
public class ComplexJUTest extends junit.framework.TestCase
{
    @Test
    public void testConstructor1Param()
    {
        Complex c1 = new Complex(5.0);
        assertEquals("5.0 + 0.0i", c1.toString());
        System.out.println( "c1 = " + c1 );
    }

    @Test
    public void testConstructor2Param()
    {
        Complex c2 = new Complex(5.0, 10.0);
        assertEquals("5.0 + 10.0i", c2.toString());
        System.out.println( "c2 = " + c2 );
    }

    @Test
    public void testAddRealAndComplexNum()
    {
        // TODO complete test
    }
    
    @Test
    public void testAdd2ComplexNums()
    {
        // TODO complete test
    }

    @Test
    public void testMultiply2ComplexNums()
    {
        // TODO complete test
    }

    @Test
    public void testMultiplyRealAndComplexNum()
    {
        // TODO complete test
    }

    @Test
    public void testAbsoluteValue()
    {
        // TODO complete test
    }
    
    public static junit.framework.Test suite()
    {
        return new JUnit4TestAdapter( ComplexJUTest.class );
    }

    public static void main( String args[] )
    {
        org.junit.runner.JUnitCore.main( "ComplexJUTest" );
    }
}
