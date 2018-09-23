import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
   TODO Write a one-sentence summary of your class here.
   TODO Follow it with additional details about its purpose, what abstraction
   it represents, and how to use it.

   @author  Nikhil Vytla
   @version 10/2/17

   @author Period - 1
   @author Assignment - JMCh10 Lipogrammer

   @author Sources - None
 */
public class LipogramAnalyzer
{
    private String text;

    /**
       Constructor: Saves the text string
       @param text String to analyze
     */
    public LipogramAnalyzer(String text)
    {
        this.text = text;
    }

    /**
       Returns the text string with all characters equal to letter 
       replaced with '#'.

       @param letter character to replace
       @return text string with all characters equal to letter 
                    replaced with '#'
     */
    public String mark(char letter)
    {
        return text.replace( letter, '#' ); 
    }


    /**
       Returns a String that concatenates all "offending"
       words from text that contain letter; the words are
       separated by '\n' characters; the returned string
       does not contain duplicate words: each word occurs
       only once; there are no punctuation or whitespace
       characters in the returned string.
  
       @param letter character to find in text
       @return String containing all words with letter
     */
    public String allWordsWith(char letter)
    {
        String result = "";
        
        return result;
    }

	// made public for test purposes
    /*
       Returns the word that contains character at pos
       excluding any punctuation or whitespace.
  1
       @param pos location of character
       @return word that contains character at pos
     */
    public String extractWord(int pos)
    {
        String c = Character.toString( text.charAt( pos ) );
        
        String sPattern = "(?i)\\b\\w*" + Pattern.quote( c ) + "\\w*\\b";
        StringBuilder result = new StringBuilder("-").append( c ).append(": ");
        
        Pattern pattern = Pattern.compile( sPattern );
        Matcher matcher = pattern.matcher( text );
        
        while (matcher.find())
        {
            result.append( matcher.group()).append( ' ' );
        }
        
        return result.toString().trim();
    }
}
