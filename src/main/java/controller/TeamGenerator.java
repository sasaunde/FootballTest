/**
 * 
 */
package controller;

import java.util.Scanner;

import capgemini.footballtest.Team;

/**
 * @author CMARRIAG
 *
 */
public class TeamGenerator {
	
	public static Team generateTeam(String row){
		String[] splitRow = row.split("\\s+"); 
		//Scanner scan = new Scanner(row);
		
		
		Team t1 = new Team(splitRow[2], Integer.parseInt(splitRow[7]), Integer.parseInt(splitRow[9]));
		return t1;
		
	}

	
	
	
	
	
}
