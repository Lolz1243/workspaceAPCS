/**
 *  Simulates a six-sided die.
 *
 *  @author  Nikhil Vytla
 *  @version 9/7/17
 *  @author  Period: 1
 *  @author  Assignment: JMCh07_RollingDice
 *
 *  @author  Sources: None
 */
public class Die
{
    private int numDots;

    /**
     * Sets numDots to a random integer from 1 to 6
     */
    public void roll()
    {
        numDots = (int)(6 * Math.random()) + 1;
    }
    
    /**
     * Returns the value of the most recent roll.
     * @return numDots
     */
    public int getNumDots()
    {
        return numDots;
    }
}
