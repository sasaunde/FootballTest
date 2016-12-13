/**
 * 
 */
package capgemini.footballtest;

/**
 * @author CMARRIAG
 *
 */
public class GoalDifference {

	public static int goaldifference(Team team){
		return team.getGoalsFor() - team.getGoalsAgainst();
	}
}
