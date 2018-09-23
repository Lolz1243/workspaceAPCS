 import java.util.*;

/**
 * Represents various States and their respective cities.
 *
 * @author TODO Your Name
 * @version TODO Date
 * @author Period - TODO Your Period
 *
 * @author Assignment - TestSem2CollectionsStates
 *
 * @author Sources - TODO list collaborators
 */
public class States
{
    private Map<String, Set<String>> theMap;

    public States()
    {
        theMap = new TreeMap<String, Set<String>>();
    }

    // postcondition: Information from theCity
    // has been added to theMap
    public void addCityToMap(CityInfo theCity)
    {
        //TODO: Complete this method
    }

    public void printOneState(String theState)
    {
        // not allowed since output is specified without the "[...]"
        // System.out.println(theState + " " + theMap.get(theState));

        //TODO: Complete this method
    }

    public void printAllStates()
    {
        //TODO: Complete this method
    }

    //*************************************************************
    // For test purposes only
    // not to be used in solution implementation
    public Map<String, Set<String>> getTheMap()
    {
        return theMap;
    }
}
