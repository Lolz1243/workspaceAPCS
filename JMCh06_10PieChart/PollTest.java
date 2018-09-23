/**
 *  Simple test class to run the poll.
 *
 *  @author  Nikhil Vytla
 *  @version 9/7/17
 *  @author  Period: 1
 *  @author  Assignment: JMCh06_10PieChart
 *
 *  @author  Sources: none
 */
public class PollTest
{
    /**
     * TODO Write your method description here.
     * @param args
     */
    public static void main (String[] args)
    {
        PollDisplayPanel votingMachine = 
                        new PollDisplayPanel("Tami", "Brian", "Liz");
        votingMachine.vote1();
        votingMachine.vote2();
        votingMachine.vote2();
        System.out.println( votingMachine );
        
    }
}
