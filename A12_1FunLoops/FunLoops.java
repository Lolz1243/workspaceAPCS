/**
 * A class to solve various loop problems
 * 
 * @author Nikhil Vytla
 * @version 9/15/17
 * 
 *          Period - 1 Assignment - A12.1 - FunLoops
 * 
 *          Sources - None
 */
public class FunLoops
{
    /**
     * 
     * Print out n number of magic squares
     * 
     * @param n
     *            number of magic squares
     */
    public void magicsquare( int n )
    {
        System.out.println( "Magic Squares" );
        /**
         * First, iterate through consecutive numbers While iterating, check for
         * perfect square using Math.sq() and modulo, and print out magic square
         * if true, else continue through the loops
         */
        int counter = 1;
        long magsq = 0;

        for ( int i = 1; i <= n; i++ )
        {
            // for counting the number of magic squares

            for ( int j = 1; j <= counter; j++ )
            {
                // should only break when a magic square has been found
                magsq += counter;

                if ( Math.sqrt( magsq ) % 1.0 == 0 )
                {
                    System.out.println( i + ": " + magsq );
                    break;
                }
                counter++;

            }
        }
    }


    /**
     * 
     * finds the least common multiple of two
     * integers, a and b.
     * 
     * @param a first integer input
     * @param b second integer input
     * @return the least common multiple
     */
    public int lcm( int a, int b )
    {
        int norm = 1;
        
        while (true)
        {
            if (norm % a == 0 && norm % b == 0)
            {
                return norm;
            }
            else
            {
                norm++;
            }
        }
        
    }


    /**
     * 
     * Main method instantiates occurrences of magicsquare()
     * and lcm()
     * 
     * @param args all args passed within the main method
     */
    public static void main( String[] args )
    {
        FunLoops fun = new FunLoops();

        fun.magicsquare( 4 );
        System.out.println();

        System.out.println( "LCM (15, 18) = " + fun.lcm( 15, 18 ) );
        System.out.println( "LCM (40, 12) = " + fun.lcm( 40, 12 ) );
        System.out.println( "LCM (2, 7) = " + fun.lcm( 2, 7 ) );
        System.out.println( "LCM (100, 5) = " + fun.lcm( 100, 5 ) );
        System.out.println();

        fun.magicsquare( 10 );
    }
}
