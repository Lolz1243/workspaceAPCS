import info.gridworld.actor.Bug;
import java.awt.Color;

/**
 * A subclass of Bug that adds the turn(angle) method and redefines Bug's act
 * method so that this bug makes a random angle turn when it can't move

 * @author  Nikhil Vytla
 * @version 8/24/17
 *
 * @author  Period - 1
 * @author  Assignment - Random Bugs - RandomBug
 *
 * @author  Sources - None
 */
public class RandomBug extends Bug
{
    public RandomBug()
    {
        setColor( Color.YELLOW );
    }

    public RandomBug( Color bugColor )
    {
        setColor( bugColor );
    }

    public void turn(int angle)
    {
        setDirection(getDirection() + angle);
    }

    // Overrides Bug's act method
    public void act()
    {
        int angle = 45 * (int)(Math.random() * 8);
        if ( canMove() )
            move();
        else
            turn(angle);
    }
}
