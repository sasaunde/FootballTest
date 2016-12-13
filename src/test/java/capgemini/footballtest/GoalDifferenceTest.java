/**
 * 
 */
package capgemini.footballtest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author CMARRIAG
 *
 */
public class GoalDifferenceTest extends TestCase {
	
	  public static Test suite()
	    {
	        return new TestSuite( GoalDifferenceTest.class );
	    }
	  
 public void testGoalDifference(){
	 int goalsFor = 12;
		String name = "Fulham";
		int goalsAgainst = 9;
		
		Team tm = new Team(name, goalsFor, goalsAgainst);
		assertEquals(3, GoalDifference.goaldifference(tm));
 }
}
