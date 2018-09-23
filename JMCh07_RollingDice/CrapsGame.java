/**
 *  Implements the game of Craps logic.
 *
 *  @author  Nikhil Vytla
 *  @version 9/7/17
 *  @author  Period: 1
 *  @author  Assignment: JMCh07_RollingDice
 *
 *  @author  Sources: None
 */
public class CrapsGame
{
    private int point = 0;

  /**
   *  Calculates the result of the next dice roll in the Craps game.
   *  The parameter total is the sum of dots on two dice.
   *  point is set to the saved total, if the game continues,
   *  or 0, if the game has ended.
   *  Returns 1 if player won, -1 if player lost,
   *  0 if player continues rolling.
   *  @param total is count1 + count2, or the
   *  total number of dots present on a single roll
   *  @return result of 1 if game is won, -1 if game is lost, or
   *  0 if game continues
   */
    public int processRoll( int total )
    {
        int result = 0;
        
        if (point == 0)
        {
            if (total == 7 || total == 11)
            {
                result = 1;
            }
            else if (total == 2 || total == 3 || total == 12)
            {
                result = -1;
            }
            else
            {
                point = total;
            }
        }
        else
        {
            if (total == 7)
            {
                result = -1;
                point = 0;
            }
            else if (total == point)
            {
                result = 1;
                point = 0;
            }
        }


        return result;
    }

    /**
     * Returns the saved point
     * @return point, the stored value of the total
     * if the game continues. Otherwise, it's set
     * as a default to 0 for completed games.
     */
    public int getPoint()
    {
        return point;
    }
}