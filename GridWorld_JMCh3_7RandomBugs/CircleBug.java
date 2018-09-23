import info.gridworld.actor.Bug;

/**
 *This class is exactly identical to CircleBug, except
 *for the fact that it only turns once in the act method.
 *
   @author  Nikhil Vytla
   @version 8/24/17

   @author  Period - 1
   @author  Assignment - GridWorld Part 2, Random bugs - CircleBug

   @author  Sources - None
 */
public class CircleBug extends Bug
{
    private int steps;
    private int sideLength;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public CircleBug( int length )
    {
        steps = 0;
        sideLength = length;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if ( steps < sideLength && canMove() )
        {
            move();
            steps++;
        }
        else
        {
            turn();
            steps = 0;
        }
    }
}