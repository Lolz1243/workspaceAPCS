/**
 * Person is the superclass for all other classes in this lab.
 *
 * @author nvytla071
 * @version Oct 17, 2017
 * @author Period: 1
 * @author Assignment: A11_1BackToSchool
 *
 * @author Sources: None
 */
public class Person
{
      private String myName;   // name of the person
      private int myAge;       // person's age
      private String myGender; // 'M' for male, 'F' for female

     /**
      * constructs person with all the variables of people.
      * @param name - name of person
      * @param age - age of person
      * @param gender - gender of person
      */
      public Person( String name, int age, String gender )
      {
          myName = name;
          myAge = age;
          myGender = gender;
      }

     /**
      * 
      * return name of person
      * @return name
      */
      public String getName()
      {
          return myName;
      }

    /**
     * 
     * return age of person
     * @return age
     */
      public int getAge()
      {
          return myAge;
      }

    /**
     * 
     * return gender of person
     * @return gender
     */
      public String getGender()
      {
          return myGender;
      }

    /**
     * 
     * set name
     * @param name value set to myName
     */
      public void setName( String name )
     {
          myName = name;
     }

    /**
     * 
     * set age
     * @param age value set to myAge
     */
      public void setAge( int age )
      {
          myAge = age;
      }


    /**
     * 
     * set gender
     * 
     * @param gender
     *            value set to myGender
     */
      public void setGender( String gender )
      {
          myGender = gender;
      }

    /**
     * Returns a String representation of this class.
     * @return private instance data as a String
     */
      public String toString()
      {
          return myName + ", age: " + myAge + ", gender: " + myGender;
      }
}