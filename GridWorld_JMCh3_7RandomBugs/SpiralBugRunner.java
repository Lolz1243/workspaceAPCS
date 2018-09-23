import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.grid.UnboundedGrid;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

/**
 * 
 * Tests the modified SpiralBug.
 * Uses default settings from BoxBugRunner with the exception of
 * the UnboundedGrid.

   @author  Nikhil Vytla
   @version 8/24/17

   @author  Period - 1
   @author  Assignment - GridWorld Part 2, Exercise 2 - SpiralBugRunner

   @author  Sources - None
 */
public class SpiralBugRunner
{
    public static void main( String[] args )
    {
        UnboundedGrid grid = new UnboundedGrid<Actor>();
        ActorWorld world = new ActorWorld( grid );
        
        SpiralBug alice = new SpiralBug( 6 );
        alice.setColor( Color.BLUE );
        world.add( new Location( 7, 8 ), alice );
        world.show();
    }
}