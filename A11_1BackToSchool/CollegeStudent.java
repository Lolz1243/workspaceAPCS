/**
 * Subclass of Student. Constructs using calls to Student
 * and also contains unique variables.
 *
 *  @author  nvytla071
 *  @version Oct 17, 2017
 *  @author  Period: 1
 *  @author  Assignment: A11_1BackToSchool
 *
 *  @author  Sources: None
 */
public class CollegeStudent extends Student
{

    private int myYear;
    private String myMajor;

    /**
     * constructs each part of college student using super calls to student
     * @param name - name of person
     * @param age - age of person
     * @param gender - gender of person
     * @param idNum - id number of person
     * @param gpa - gpa of person
     * @param year - year of person
     * @param major - major of person
     */
    public CollegeStudent(String name, int age, String gender, String idNum, 
        double gpa, int year, String major)
    {
        super(name, age, gender, idNum, gpa);
        
        myYear = year;
        myMajor = major;
    }


    /**
     * 
     * return current year
     * @return year
     */
    public int getYear()
    {
        return myYear;
    }
    /**
     * 
     * set current year
     * @param year value sent to myValue
     */
    public void setYear(int year)
    {
        myYear = year;
    }
    /**
     * 
     * return student major
     * @return major
     */
    public String getMajor()
    {
        return myMajor;
    }
    /**
     * 
     * sets major
     * @param major value pushed myMajor
     */
    public void setMajor(String major)
    {
        myMajor = major;
    }
    /**
     * Returns a String representation of this class.
     * @return private instance data as a String
     */
    public String toString()
    {
        return super.toString() + ", year: " + myYear +
            ", major: " + myMajor;
    }
}
