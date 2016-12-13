/**
 * 
 */
package capgemini.footballtest;

import java.util.ArrayList;

import junit.framework.TestCase;

/**
 * @author CMARRIAG
 *
 */ 
public class ConsoleDisplayTest extends TestCase{

	public void testDisplay(){
		int goalsFor = 12;
		String name = "Fulham";
		int goalsAgainst = 9;
		
	Team tm = new Team(name, goalsFor, goalsAgainst);
	ArrayList<Team> league = new ArrayList<Team>();
	league.add(tm);
	
	League l = new League(league);
	ConsoleDisplay cd = new ConsoleDisplay();
	String s = cd.toString(l);
	assertEquals("Fulham : goalDifference 3\n", s );
	}

}
