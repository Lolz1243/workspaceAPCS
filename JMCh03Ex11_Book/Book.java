/**
 * This class constructs the book and contains all the accessor methods.
 *
 * @author Nikhil Vytla
 * @version 8/24/17
 * @author Period: 1
 * @author Assignment: JMCh03Ex11_Book
 *
 * @author Sources: None
 */
public class Book
{
    private int numPages;

    private int currentPage;


    /**
     * 
     * @param i is an integer that stands for
     * the number of pages
     */
    public Book( int i )
    {
        numPages = i;
        currentPage = 1;
    }


    /**
     * 
     * Accessor method for number of pages.
     * @return number of pages as an int.
     */
    public int getNumPages()
    {
        return numPages;
    }


    /**
     * 
     * Accessor method for current page.
     * @return current page as an int
     */
    public int getCurrentPage()
    {
        return currentPage;
    }


    /**
     * 
     * increments the current page
     * if the current page is less
     * than the number of pages
     */
    public void nextPage()
    {
        if ( currentPage < numPages )
        {
            currentPage++;
        }
    }
}
