// Implements the list of messages for teletext

import java.awt.Graphics;
/**
 * 
 *  TODO Write a one-sentence summary of your class here.
 *  TODO Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author  nvytla071
 *  @version Dec 7, 2017
 *  @author  Period: 1
 *  @author  Assignment: JMCh20_7Teletext
 *
 *  @author  Sources: None
 */
public class TeletextList
{
    private ListNode2<String> heading, topNode;

    /**
     * Creates a circular list of headlines. First creates a circular list
     * with one node, "Today's headlines:". Saves a reference to that node in
     * heading. Adds a node holding an empty string before heading and another
     * node holding an empty string after heading. Appends all the strings
     * from headlines to the list, after the blank line that follows heading,
     * preserving their order. Sets topNode equal to heading.
     * 
     * @param headlines  Strings to add to circular list
     */
    public TeletextList(String[] headlines)
    {
        ListNode2<String> node = new ListNode2<String>("Today's headlines:", null, null);
        heading = node;
        heading.setNext( new ListNode2<String>("", heading, null));
        heading.setPrevious(new ListNode2<String>("", null, heading));
        topNode = heading;
        ListNode2<String> string = heading.getNext();
        
        for(String str : headlines)
        {
            ListNode2<String> added = new ListNode2<String>(str, string, null);
            string.setNext(added);
            string = added;
        }
        
        string.setNext(heading.getPrevious());
        heading.getPrevious().setNext(string);
    }

    /**
     * Inserts a node with msg into the headlines list after the blank /line
     * that follows heading.
     * 
     * @param msg  String to add to headlines list
     */
    public void insert(String msg)
    {
        //TODO complete method
    }

    /**
     * Deletes the node that follows topNode from the headlines list, unless
     * that node happens to be heading or the node before or after heading that
     * holds a blank line.
     */
    public void delete()
    {
        if(topNode.getNext() == heading || 
                        heading.getPrevious().getValue() == "" 
                        || heading.getNext().getValue() == "")
        {
            
        }
        else
        {
            //
        }
    }

    /**
     * Scrolls up the headlines list, advancing topNode to the next node.
     */
    public void scrollUp()
    {
        //topNode = heading.getNext();
    }

    /*
     * Adds a new node with msg to the headlines list before a given node.
     * Returns a referenece to the added node.
     */
    private ListNode2<String> addBefore( ListNode2<String> node, String msg )
    {
        ListNode2<String> newNode = new ListNode2<String>(msg, node.getPrevious(), node);
        node.getPrevious().setNext(newNode);
        node.setPrevious(newNode);
        return newNode;
    }

    /*
     * Adds a new node with msg to the headlines list after a given node.
     * Returns a referenece to the added node.
     */
    private ListNode2<String> addAfter(ListNode2<String> node, String msg)
    {
        //TODO complete method
        return null; //fix this
    }

    /*
     * Removes a given node from the list.
     */
    private void remove(ListNode2<String> node)
    {
        node.getPrevious().setNext( node.getNext() );
        //another line
    }

    /*
     * Draws nLines headlines in g, starting with topNode at x, y and
     * incrementing y by lineHeight after each headline.
     */
    public void draw( Graphics g, int x, int y, int lineHeight, int nLines )
    {
        ListNode2<String> node = topNode;
        for ( int k = 1; k <= nLines; k++ )
        {
            g.drawString( node.getValue(), x, y );
            y += lineHeight;
            node = node.getNext();
        }
    }

    /**
     * Returns a string representation of this TeletextList.
     * 
     * @return a string representation of this TeletextList.
     */
    public String toString()
    {
        String str = getClass().getName() + "[";
        String separator = "";

        for ( ListNode2<String> node = heading; node.getNext() != heading;
              node = node.getNext() )
        {
            str += ( separator + node.getValue() );
            separator = ", ";
        }

        return str + "]";
    }
}
