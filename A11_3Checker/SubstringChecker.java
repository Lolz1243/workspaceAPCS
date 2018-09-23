/*** TODO Part (a) ***/
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
public class SubstringChecker implements Checker
{
    String subText;
    
    public SubstringChecker(String text)
    {
        subText = text;
    }

    @Override
    public boolean accept( String text )
    {
        int index = -20000;
        
        if (subText.contains( text ))
        {
            index = subText.indexOf( text );
            return true;
        }
        else
        {
            return false;
        }
    }
}
