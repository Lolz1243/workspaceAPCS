/**
 * 
 * Student subclass of Person superclass. Constructs itself
 * using calls to Person and also has other unique variables.
 *
 *  @author  nvytla071
 *  @version Oct 17, 2017
 *  @author  Period: 1
 *  @author  Assignment: A11_1BackToSchool
 *
 *  @author  Sources: None
 */
public class Student extends Person
{
    private String myIdNum; // Student Id Number
    private double myGPA;   // grade point average

    /**
     * 
     * @param name - name of person
     * @param age - age of person
     * @param gender - gender of person
     * @param idNum - id number of person
     * @param gpa - numerical gpa of person
     */
    public Student( String name, int age, String gender, String idNum,
                    double gpa )
    {
        // use the super class' constructor
        super( name, age, gender );

        // initialize what's new to Student
        myIdNum = idNum;
        myGPA = gpa;
    }

    /**
     * 
     * gets idNum of person
     * @return id number
     */
    public String getIdNum()
    {
        return myIdNum;
    }

    /**
     * 
     * gets gpa of person
     * @return grade point average
     */
    public double getGPA()
    {
        return myGPA;
    }

    /**
     * 
     * sets id number here
     * @param idNum value that is pushed to myIdNum
     */
    public void setIdNum( String idNum )
    {
        myIdNum = idNum;
    }

    /**
     * 
     * sets gpa here
     * @param gpa value that is pushed to myGPA
     */
    public void setGPA( double gpa )
    {
        myGPA = gpa;
    }

    /**
     * Returns a String representation of this class.
     * @return private instance data as a String
     */
    public String toString()
    {
        return super.toString() + ", student id: " +
            myIdNum + ", gpa: " + myGPA;
    }
}
