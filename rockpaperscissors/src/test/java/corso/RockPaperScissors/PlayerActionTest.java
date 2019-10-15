package corso.RockPaperScissors;

import corso.RockPaperScissors.model.Player;
import corso.RockPaperScissors.model.PlayerAction;
import corso.RockPaperScissors.model.enums.Throw;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class PlayerActionTest 
    extends TestCase
{
	
	public PlayerAction _sus;  
	
    public PlayerActionTest( String testName )
    {
        super( testName );
    }

   
    public static Test suite()
    {
        return new TestSuite(PlayerActionTest.class );
    }

    
    public void testPlayerActionMethods()
    {
    	Player player = new Player("playerTest");
    	Throw throwused = Throw.PAPER;
        _sus = new PlayerAction(player, throwused); 
        
        assertNotNull(_sus);
        assertEquals(player, _sus.getPlayerOwner());
        assertEquals(Throw.PAPER, _sus.getThrowUsed());
    }
    
   
    
}
