import java.util.List;
import java.util.Stack;

public class BrowserModel
{
    private BrowserView view;
    private Stack<Integer> backStk, forwardStk;
    private int topLine;

    public BrowserModel(BrowserView view)
    {
        this.view = view;
        this.view.update( topLine );
        
        backStk = new Stack<Integer>();
        forwardStk = new Stack<Integer>();
    }


    public void back()
    {
        
    }
    
    public void forward()
    {
        
    }
    
    public void home()
    {
        
    }
    
    public void followLink(int n)
    {
        view.update( n );
        //      
    }
    
    public boolean hasBack()
    {
        return true;
    }
    
    public boolean hasForward()
    {
        return true;
    }


    // The following are for test purposes only
    public Stack<Integer> getBackStk()
    {
        return backStk;
    }

    public Stack<Integer> getForwardStk()
    {
        return forwardStk;
    }

    public int getTopLine()
    {
        return topLine;
    }
}

