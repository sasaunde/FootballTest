package capgemini.footballtest;

/**
 * Hello world!
 *
 */
public class Team 
{
	private int goalsFor = 0;
	private String name = null;
	private int goalsAgainst = 0;
   
	public Team(String name, int goalsFor, int goalsAgainst) {
		// TODO Auto-generated constructor stub
    	this.goalsFor = goalsFor;
    	this.name = name;
    	this.goalsAgainst = goalsAgainst;
	}

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

	/**
	 * @return the goalsFor
	 */
	public int getGoalsFor() {
		return goalsFor;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the goalsAgainst
	 */
	public int getGoalsAgainst() {
		return goalsAgainst;
	}
	
	
}
