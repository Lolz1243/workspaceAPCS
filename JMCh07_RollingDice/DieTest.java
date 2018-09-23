/**
 * 
 *  Prints out the number of dots using the getNumDots()
 *  method. Creates a new die and rolls it three times.
 *
 *  @author  nvytla071
 *  @version Sep 8, 2017
 *  @author  Period: 1
 *  @author  Assignment: JMCh07_RollingDice
 *
 *  @author  Sources: None
 */
public class DieTest
{
    /**
     * 
     * Rolls the die three times and prints out
     * the number on each roll.
     * @param args refers to all args inputed
     * into the main method.
     */
    public static void main(String[] args)
    {
        Die die1 = new Die();
    
        die1.roll();
        System.out.println( die1.getNumDots() );
    
        die1.roll();
        System.out.println( die1.getNumDots());
    
        die1.roll();
        System.out.println( die1.getNumDots() );
    }
}
