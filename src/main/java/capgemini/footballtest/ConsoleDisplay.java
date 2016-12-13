/**
 * 
 */
package capgemini.footballtest;

/**
 * @author CMARRIAG
 *
 */
public class ConsoleDisplay implements Display{

	public String toString(League league) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		for(Team teams: league.getLeague()){
			sb.append(teams.getName()).append(" : goalDifference ").append(GoalDifference.goaldifference(teams)).append("\n");
		}
		return sb.toString();
	}

	
	
}
