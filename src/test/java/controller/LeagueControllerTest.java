/**
 * 
 */
package controller;

import java.io.FileNotFoundException;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * @author CMARRIAG
 *
 */
public class LeagueControllerTest extends TestCase {

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	/*@Test 
	public void testReadFile(){
		LeagueController lc = new LeagueController();
		try {
			assertEquals("Arsenal : goalDifference 0\n", lc.readFile("D:\\Users\\cmarriag\\Documents\\testscores.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail(e.getMessage());
		}
		
	}
	*/
	
	@Test 
	public void testReadWholeFile(){
		LeagueController lc = new LeagueController();
		try {
			String s = lc.readFile("D:\\Users\\cmarriag\\Documents\\scores.txt"); 
			assertEquals(true, s.contains("Liverpool"));
			assertEquals(true, s.contains("Ipswich"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail(e.getMessage());
			
		}
		
	}

}
