/**
 * teacher subclass of person.
 *
 *  @author  nvytla071
 *  @version Oct 17, 2017
 *  @author  Period: 1
 *  @author  Assignment: A11_1BackToSchool
 *
 *  @author  Sources: None
 */
public class Teacher extends Person
{

    private double mySalary;
    private String mySubject;

    /**
     * constructs teacher using super calls to person
     * @param name of person
     * @param age of person
     * @param gender of person
     * @param subject of person
     * @param salary of person
     */
    public Teacher( String name, int age, String gender, 
        String subject, double salary)
    {
        super(name, age, gender);
        
        
        mySubject = subject;
        mySalary = salary;
    }

    /**
     * 
     * return subject
     * @return subject
     */
    public String getSubject()
    {
        return mySubject;
    }
    /**
     * 
     * set subject of teacher
     * @param subject value passed to mySubject
     */
    public void setSubject(String subject)
    {
        mySubject = subject;
    }
    /**
     * 
     * return salary
     * @return salary of teacher
     */
    public double getSalary()
    {
        return mySalary;
    }
    /**
     * 
     * set salary of teacher
     * @param salary value passed to mySalary
     */
    public void setSalary(double salary)
    {
        mySalary = salary;
    }

    /**
     * Returns a String representation of this class.
     * @return private instance data as a String
     */
    public String toString()
    {
        return super.toString() + ", subject: " + mySubject +
            ", salary: " + mySalary;
    }
}
