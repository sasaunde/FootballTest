package capgemini.footballtest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TeamTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TeamTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( TeamTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    int goalsFor = 0;
	String name = null;
	int goalsAgainst = 0;
	
	Team tm = new Team(name, goalsFor, goalsAgainst);
       assertEquals(0, tm.getGoalsFor());
       assertEquals(0, tm.getGoalsAgainst());
       assertEquals(null, tm.getName());
       
       Team tm2 = new Team("Fulham", goalsFor, goalsAgainst);
       assertEquals("Fulham", tm2.getName());
       
    }
}
