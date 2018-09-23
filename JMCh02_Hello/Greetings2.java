
/**
 *  Takes the user's first and last name as an input and outputs a message 
 *  including the user's full name.
 *  Imports a scanner and takes two strings as input. Then, it takes those
 *  strings and displays them in the output, along with another string 
 *  through the use of System.out.println.
 *
 *  @author  Nikhil Vytla
 *  @version 8/17/17
 *  @author  Period: 1
 *  @author  Assignment: JMCh02_Hello - Greetings2.java
 *
 *  @author  Sources: None
 */

import java.util.Scanner;

public class Greetings2
{
    public static void main(String[] args)
    {
    Scanner kboard = new Scanner(System.in);
    System.out.print("Enter your first name: ");
    String firstName = kboard.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = kboard.nextLine();
    System.out.println("Hello, " + firstName + " " + lastName);
    System.out.println("Welcome to Java!");
    }
}
