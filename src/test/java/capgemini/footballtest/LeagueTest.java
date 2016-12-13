package capgemini.footballtest;

import java.util.ArrayList;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class LeagueTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public LeagueTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( LeagueTest.class );
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
    	ArrayList<Team> league = new ArrayList<Team>();
    	league.add(tm);
    	
    	League l = new League(league);
    	assertEquals(league, l.getLeague());
    }
}
