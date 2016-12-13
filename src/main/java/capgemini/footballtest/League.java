package capgemini.footballtest;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class League 
{
	private ArrayList<Team> league = new ArrayList<Team>();
	
	public League(ArrayList<Team> league){
		this.league = league;
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }



	public ArrayList<Team> getLeague() {
		return league;
	}



	public void setLeague(ArrayList<Team> league) {
		this.league = league;
	}
    
    
}
