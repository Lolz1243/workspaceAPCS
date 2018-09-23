import java.util.Arrays;

/**
   TODO Write a one-sentence summary of your class here.
   TODO Follow it with additional details about its purpose, what abstraction
   it represents, and how to use it.

   @author  Nikhil Vytla
   @version 2/5/18

   @author Period - 1
   @author Assignment - JM 24.3 Lab: Cryptogram Solver

   @author Sources - None
 */
public class Enigma
{
    private char[] lookupTable;

    public Enigma(int numLetters)
    {
        //TODO complete method
    }

    public void setSubstitution(int index, char ch)
    {
        lookupTable[index] = ch;
    }

    public String decode(String text)
    {
        StringBuffer buffer = new StringBuffer(text.length());

        // TODO complete method

        return buffer.toString();
    }

    public String getHints(String text, String lettersByFrequency)
    {
        // TODO complete method

        return new String(/* FIX THIS */);
    }

    private int[] countLetters(String text)
    {
        int[] counts = new int[lookupTable.length];

        for (int index = 0; index < counts.length; index++)
        {
            counts[index] = 0;
        }

        return counts;
    }

    //*************************************************************
    // For test purposes only
    // not to be used in solution implementation

    public char[] getLookupTable()
    {
        return lookupTable;
    }

    public int[] getCountLetters(String text)
    {
        return countLetters(text);
    }

}