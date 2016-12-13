/**
 * 
 */
package controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import capgemini.footballtest.Team;

/**
 * @author CMARRIAG
 *
 */
public class TeamGeneratorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testTeamGenerator(){
		String input = "    1. Arsenal         38    26   9   3    46  -  46    87";
		Team t = TeamGenerator.generateTeam(input);
		assertEquals("Arsenal", t.getName());
		assertEquals(46, t.getGoalsFor());
		assertEquals(46, t.getGoalsAgainst());
	}
	@Test 
	public void testUnitedTest(){
		String input = "    3. Manchester_U    38    24   5   9    87  -  45    77";
		Team t = TeamGenerator.generateTeam(input);
		assertEquals("Manchester_U", t.getName());
		assertEquals( 87, t.getGoalsFor());
		assertEquals(45, t.getGoalsAgainst());
	}
}
