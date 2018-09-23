/**
 * This is a class that tests the Book class.
 *
 * @author Nikhil Vytla
 * @version 8/24/17
 * @author Period: 1
 * @author Assignment: JMCh03Ex11_Book
 *
 * @author Sources: None
 */
public class BookTest
{
    /**
     * The main method in this class checks the Book operations for consistency.
     * 
     * @param args
     *            is not used.
     */
    public static void main( String[] args )
    {
        Book book = new Book( 3 );
        System.out.println( book.getNumPages() );
        System.out.println( book.getCurrentPage() );

        for ( int j = 0; j < 3; j++ )
        {
            book.nextPage();
            System.out.println( book.getCurrentPage() );
        }
    }
}
