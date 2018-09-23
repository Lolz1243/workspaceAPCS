/*** Part (c) ***/
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
public class NotChecker implements Checker
{
    Checker x;
    
    public NotChecker(Checker a)
    {
        x = a;
    }
    
    @Override
    public boolean accept( String text )
    {
        if(x.accept( text ))
        {
            return false;
        }
        else
        {
            return true;
        }

    }
}
