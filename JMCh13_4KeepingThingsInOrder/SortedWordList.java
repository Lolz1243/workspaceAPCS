/**
   Implements a sorted list of words

   @author  Nikhil Vytla
   @version 11/17/17

   @author Period - 1
   @author Assignment - Java Methods 13.4 Lab: Keeping Things in Order

   @author Sources - None
 */
public class SortedWordList extends java.util.ArrayList<String>
{
    public SortedWordList()
    {
        super();
        //no-args constructor
    }
    
    public SortedWordList(int cap)
    {
        super(cap);
    }
    
    public boolean contains(String str)
    {
        if(indexOf(str) == -1)
        {
            return false;
        }
        
        return true;

    }
    
    public int indexOf(String str)
    {
        int a = 0;
        int b;
        int c = this.size() - 1;
        
        while (a <= c)
        {
            b = (a+c)/2;
            int d = str.compareToIgnoreCase(this.get(b));
            
            if(d > 0)
            {
                a = b + 1;
            }
            else if(d < 0)
            {
                c = b - 1;
            }
            else
            {
                return b;
            }
        }
        
        return -1;
    }
    
    public String set(int i, String word)
    {
        String str;
        
        if(i == 0 && word.compareTo(this.get(i+1)) < 0 && !word.equals(this.get(i+1)))
        {
            str = super.set(i, word);
        }
        else if(word.compareTo(this.get(i-1)) > 0 && word.compareTo(this.get(i+1)) < 0 && 
                        !word.equals(this.get(i+1)) && !word.equals(this.get(i-1)))
        {
            str = super.set(i, word);
        }
        else
        {
            throw new IllegalArgumentException("word =" + word + " i =" + i);
        }
        return str;
    }

    public boolean add(String word)
    {
        int a = 0;
        int b;
        int c = this.size() - 1;
        
        if(this.contains(word))
        {
            return false;
        }
        
        while(a <= c)
        {
            b = (a+c)/2;
            int less = word.compareTo(this.get(b));
            
            if(less > 0)
            {
                a = b + 1;
            }
            else if(less < 0)
            {
                c = b - 1;
            }
        }
        
        super.add(c + 1, word);
        return true;
    }
    
    public void add(int index, String word)
    {
        if(index == 0)
        {
            if(word.compareTo(this.get(index)) < 0)
            {
                super.add(index, word);
                return;
            }
        }
        else if(index == this.size())
        {
            if(word.compareTo(this.get(index - 1)) > 0)
            {
                super.add(index, word);
                return;
            }
        }
        else if(index < this.size() && word.compareTo(this.get(index)) < 0 
                        && word.compareTo(this.get(index - 1)) > 0)
        {
            super.add(index, word);
        }
        else
        {
            throw new IllegalArgumentException("word =" + word + " i =" + index);
        }
        
    }
    
    public void merge( SortedWordList additionalWords )
    {
        for (String str : additionalWords)
        {
            add(str);
        }
    }
}
