/**
 * 
 */
package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

import capgemini.footballtest.ConsoleDisplay;
import capgemini.footballtest.Display;
import capgemini.footballtest.League;
import capgemini.footballtest.Team;

/**
 * @author CMARRIAG
 *
 */
public class LeagueController {

	public String readFile(String fileLocation) throws FileNotFoundException{
		Scanner s = new Scanner(new File(fileLocation));
		try{
		s.nextLine(); 
		}catch(NoSuchElementException e){
			return "";
		}
		ArrayList<Team> teams = new ArrayList<Team>();
		while(s.hasNext()){
			String nextRow = s.nextLine();
			if (!nextRow.contains(".")) {
				continue;
			}
			
			
			teams.add(TeamGenerator.generateTeam(nextRow));
		
		}
		Display ds = new ConsoleDisplay();
		League league = new League(teams);
		return ds.toString(league);
	}
	
	
		
	
}
