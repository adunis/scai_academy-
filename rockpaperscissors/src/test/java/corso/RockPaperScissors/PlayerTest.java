package corso.RockPaperScissors;

import corso.RockPaperScissors.model.Match;
import corso.RockPaperScissors.model.Player;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class PlayerTest 
    extends TestCase
{
	
	public Player _sus;  
	
    public PlayerTest( String testName )
    {
        super( testName );
    }

   
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    
    
    public void testPlayerUserName()
    {
        _sus = new Player("_susPlayer"); 
        assertEquals("_susPlayer", _sus.getUserName());
    }
   
    
    
   public void testGetMatchRecord() {
	   Player _sus = new Player ("_susPlayer"); 
	   Match match = new Match();
	   _sus.addMatch(match);
	  
	   assertNotNull(_sus.getMatchRecord());
   }
    
}
