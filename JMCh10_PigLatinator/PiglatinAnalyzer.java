import java.util.Scanner;
/**
   TODO Write a one-sentence summary of your class here.
   TODO Follow it with additional details about its purpose, what abstraction
   it represents, and how to use it.

   @author  TODO Your Name
   @version TODO Date

   @author  Period - TODO Your Period
   @author  Assignment - TODO Assignment Name

   @author  Sources - TODO list collaborators
 */
public class PiglatinAnalyzer
{
    private String text;

    // Constructor: saves the text string
    public PiglatinAnalyzer(String text)
    {
        this.text = text;
    }

    /**
     * Converts a string to it piglatin form according to the following rules:
     *   a. If there are no vowels in englishWord, then pigLatinWord is just
     *      englishWord + "ay". (There are ten vowels: 'a', 'e', 'i', 'o',
     *      and 'u', and their uppercase counterparts.)
     *   b. Else, if englishWord begins with a vowel, then pigLatinWord is just
     *      englishWord + "yay".
     *   c. Otherwise (if englishWord has a vowel in it and yet doesn't start
     *      with a vowel), then pigLatinWord is end + start + "ay", where end
     *      and start are defined as follows:
     *        1. Let start be all of englishWord up to (but not including) its
     *           first vowel.
     *        2. Let end be all of englishWord from its first vowel on.
     *        3. But, if englishWord is capitalized, then capitalize end and
     *           "uncapitalize" start.
     *
     * @return   piglatin version of text as a String
     */
    public String phraseToPigLatin()
    {
        String phraseToTranslate = text;
        String translation = "";

        String[] split = text.split( "\\s+" );
        
        for(int i = 0; i < split.length; i++)
        {
            translation += wordToPigLatin(split[i]) + " ";
        }

        return translation;
    }

    /**
     *  Converts an "english" word to its piglatin form
     *
     * @param  englishWord  a string representing an english word
     * @return              piglatin form of the english word
     */
    public String wordToPigLatin(String englishWord)
    {
        String pigLatinWord = "";

        for (int i = 0; i < englishWord.length(); i++)
        {
            if (indexEng(englishWord) == -1)
            {
                pigLatinWord = englishWord + "ay";
            }
            else if (indexEng(englishWord) == 0)
            {
                pigLatinWord = englishWord + "yay";
            }
            else 
            {
                String end = englishWord.substring(indexEng(englishWord));
                String start = englishWord.substring(0, indexEng(englishWord));
                String start2 = "";
                String end2 = "";
                
                if(Character.isUpperCase(englishWord.charAt(0)))
                {
                    String firstEnd = Character.toString(end.charAt(0)).toUpperCase();
                    start2 = start.toLowerCase();
                    end2 = firstEnd + end.substring( 1, end.length() );
                }
                else if(Character.isLowerCase(englishWord.charAt(0)))
                {
                    start2 = start.toLowerCase();
                    end2 = end.toLowerCase();
                }
                
                pigLatinWord = end2 + start2 + "ay";
            }
        }
        return pigLatinWord;
    }
    
    public int indexEng(String word)
    {
        int ind = -1;
        char ch;
        for(int i = 0; i < word.length(); i++)
        {
            ch = word.charAt(i);

            if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || 
                            ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || 
                            ch == 'U')
            {
                ind = i;
                break;
            }
            
        }
        
        return ind;
        
    }


}
