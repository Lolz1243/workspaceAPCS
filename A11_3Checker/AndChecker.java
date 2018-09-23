/*** Part (b) ***/
// TODO complete documentation
/**
 * 
 *  TODO Write a one-sentence summary of your class here.
 *  TODO Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author  nvytla071
 *  @version Oct 20, 2017
 *  @author  Period: 1
 *  @author  Assignment: A11_3Checker
 *
 *  @author  Sources: None
 */
public class AndChecker implements Checker
{
    Checker one;
    Checker two;
    
    public AndChecker(Checker a, Checker b)
    {
        one = a;
        two = b;
    }
    
    @Override
    public boolean accept( String text )
    {
        if(one.accept( text ) && two.accept( text ))
        {
            return true;
        }
        else
        {
            return false;  
        }

    }
}
