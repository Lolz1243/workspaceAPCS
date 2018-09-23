/**
 * 
 *  TODO Write a one-sentence summary of your class here.
 *  TODO Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author  nvytla071
 *  @version Oct 24, 2017
 *  @author  Period: 1
 *  @author  Assignment: A29_1OldMacDonald
 *
 *  @author  Sources: None
 */
class NamedCow extends Cow
{
    private String myName;
   
    /**
     * constructor with NamedCow
     * @param type type of cow
     * @param name name of cow
     * @param sound sound of cow
     */
    public NamedCow( String type, String name, String sound )
    {
        super( type, sound );
        myName = name;
    }
    
    /**
     * another constructor
     * @param type type of cow
     * @param sound sound of cow
     */
    public NamedCow( String type, String sound)
    {
        super( type, sound );
    }
    
    /**
     * 
     * returns name of cow
     * @return name of cow
     */
    public String getName()
    {
        return myName;
    }
}
