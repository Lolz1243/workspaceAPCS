import java.util.*;

/**
 * RPN Calculator
 *
 * @author Nikhil Vytla
 * @version 1/9/18
 * @author Period: 1
 * @author Assignment: AB31RPN Calculator
 *
 * @author Sources: None0
 */
public class RPN
{
    Scanner scan = new Scanner( System.in );
    
    private Stack<Integer> myStack;
    private Queue<String> myQ;

    /**
     * Constructs an RPN Calculator
     */
    public RPN()
    {
        myStack = new Stack<Integer>();
        myQ = new LinkedList<String>();
    }
    
    /**
     *  **** Used for testing - Do Not Remove ***
     *  
     *  Constructs an RPN Calculator and then redirects the Scanner input
     *  to the supplied string.
     *  
     *  @param console  replaces console input
     */
    public RPN(String console)
    {
        this();
        scan = new Scanner( console );
    }

    /**
     * TODO Write your method description here.
     */
    public void calculate()
    {
        
    }

    // TODO: additional helper methods 
    
    /**
     * Instantiates an RPN Calculator and invokes it calculate method
     * 
     * @param args  command-line arguments (not used)
     */
    public static void main( String[] args )
    {
        RPN rpn = new RPN();
        rpn.calculate();
    }
}