/**
 * 
 * TODO Write a one-sentence summary of your class here. TODO Follow it with
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 *
 * @author nvytla071
 * @version Oct 23, 2017
 * @author Period: 1
 * @author Assignment: A29_1OldMacDonald
 *
 * @author Sources: None
 */
class Pig implements Animal
{
    private String myType;

    private String mySound;


    /**
     * Initializes a newly created Pig object so that it represents an Animal of
     * the specified type that makes the specified sound.
     * 
     * @param type
     *            the type of Pig
     * @param sound
     *            the sound the Pig makes
     */
    public Pig( String type, String sound )
    {
        myType = type;
        mySound = sound;
    }


    /**
     * returns pig sound
     * @return sound of pig
     */
    public String getSound()
    {
        return mySound;
    }


    /**
     * returns pig type
     * @return type of pig
     */
    public String getType()
    {
        return myType;
    }
}