/**
 * 
 *  TODO Write a one-sentence summary of your class here.
 *  TODO Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author  nvytla071
 *  @version Oct 23, 2017
 *  @author  Period: 1
 *  @author  Assignment: A29_1OldMacDonald
 *
 *  @author  Sources: None
 */
class Chick implements Animal
{
    private String myType;
    private String mySound;
    private String mySound2;
    
    /**
        Initializes a newly created Chick object so that it represents an Animal
        of the specified type that makes the specified sound.
      
        @param  type       the type of Chick
        @param  sound      the sound the Chick makes
     */
    public Chick(String type, String sound)
    {
        myType = type;
        mySound = sound;
    }
    
    /**
     * Initializes a newly created Chick object so that it represents an Animal
        of the specified type that makes the specified sound.
     * 
     * @param type type of Chick
     * @param sound1 first sound a chick makes
     * @param sound2 second sound a chick makes
     */
    public Chick(String type, String sound1, String sound2)
    {
        myType = type;
        mySound = sound1;
        mySound2 = sound2;
    }
    
    /**
     * returns sound of chick
     * @return song sound that chick makes
     */
    public String getSound()
    {
        String song = "";
        
        if (!mySound2.isEmpty())
        {
            int num = (int)((Math.random() + .5) * 2);
            
            if (num == 1)
            {
                song = mySound;
            }
            else if (num == 2)
            {
                song = mySound2;
            }
        }
        else
        {
            song = mySound; 
        }
        
        return song;
    }
    
    /**
     * returns type of chicken
     * @return myType chick type
     */
    public String getType()
    {
        return myType;
    }
}