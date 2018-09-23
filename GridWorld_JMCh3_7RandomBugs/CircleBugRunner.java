import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * 
 * Tests the modified CircleBug.
 * Uses default settings from BoxBugRunner.

   @author  Nikhil Vytla
   @version 8/24/17

   @author  Period - 1
   @author  Assignment - GridWorld Part 2, Random Bugs - CircleBugRunner

   @author  Sources - None
 */
public class CircleBugRunner
{
    public static void main( String[] args )
    {
        ActorWorld world = new ActorWorld();
        CircleBug alice = new CircleBug( 6 );
        alice.setColor( Color.BLUE );
        world.add( new Location( 7, 8 ), alice );
        world.show();

    }
}