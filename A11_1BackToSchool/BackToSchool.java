/**
 * Main() that constructs all of the classes 
 * (Person, Student, Teacher, and CollegeStudent) 
 * and calls their toString() method.
 *
 *  @author  nvytla071
 *  @version Oct 17, 2017
 *  @author  Period: 1
 *  @author  Assignment: A11_1BackToSchool
 *
 *  @author  Sources: None
 */
public class BackToSchool
{
    /**
     * 
     * Constructs each type of person.
     * @param args all arguments passed through main.
     */
    public static void main( String[] args )
    {
        Person bob = new Person( "Coach Bob", 27, "M" );
        System.out.println( bob );

        Student lynne = new Student( "Lynne Brooke", 16, "F",
            "HS95129", 3.5 );
        System.out.println( lynne );

        Teacher mrJava = new Teacher( "Duke Java", 34, "M",
            "Computer Science", 50000 );
        System.out.println( mrJava );

        CollegeStudent ima = new CollegeStudent( "Ima Frosh", 18, "F",
            "UCB123", 4.0, 1, "English" );
        System.out.println( ima );
    }
}
