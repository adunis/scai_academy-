package corso.RockPaperScissors;

import java.util.ArrayList;
import java.util.List;

import corso.RockPaperScissors.model.*;
import corso.RockPaperScissors.model.enums.Throw;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MatchTest extends TestCase {

	public Match _sus;

	public MatchTest(String testname) {
		super(testname);
	}

	public static Test suite() {
		return new TestSuite(MatchTest.class);
	}

	public void testMatchCreation() {

		_sus = new Match();
		assertNotNull(_sus);

	}

	public void testAddRound() {

		_sus = new Match();


		Player p1 = new Player("playerOne");
		Player p2  = new Player("playerTwo");
		
		PlayerAction p1Action = new PlayerAction(p1, Throw.PAPER);
		PlayerAction p2Action = new PlayerAction(p2, Throw.ROCK);

		Round roundOne = new Round(p1Action, p2Action);

		List<Round> listRounds = new ArrayList<Round>();
		listRounds.add(roundOne);

		_sus.addRound(roundOne);

		assertEquals(listRounds, _sus.getListRounds());
		assertEquals(p1, _sus.getPlayerOne());
	}
	

	public void testGetMatchWinner() {

		_sus = new Match();

		Player playerOne = new Player("playerOne");
		Player playerTwo = new Player("playerTwo");

		_sus.setPlayerOne(playerOne);
		_sus.setPlayerTwo(playerTwo);

		_sus.setP1Wins(2);
		_sus.setP2Wins(1);

		assertEquals(playerOne, _sus.getMatchWinner());
	}

	public void testUpdateMatchWithNoWinner() {

		_sus = new Match();

		Player p1 = new Player("pTestOne");
		Player p2 = new Player("pTestOne");

		PlayerAction p1Action = new PlayerAction(p1, Throw.ROCK);
		PlayerAction p2Action = new PlayerAction(p2, Throw.PAPER);

		Round roundOne = new Round(p1Action, p2Action);
		_sus.updateMatch(roundOne);

		assertEquals(null, _sus.getMatchWinner());
	}

	public void testUpdateMatchWithNoWinner2() {

		_sus = new Match();

		Player p1 = new Player("pTestOne");
		Player p2 = new Player("pTestOne");
		
		_sus.setPlayerOne(p1);
		_sus.setPlayerTwo(p2);
		
		_sus.setP1Wins(5);
		_sus.setP2Wins(5);

		assertEquals(null, _sus.getMatchWinner());
	}

	public void testGetRoundWinner() {
		
		_sus = new Match();

		Player p1 = new Player("pTestOne");
		Player p2 = new Player("pTestOne");
		
		PlayerAction pOneActionRound1 = new PlayerAction(p1, Throw.PAPER);
		PlayerAction pTwoActionRound1 = new PlayerAction(p2, Throw.ROCK);
		
		Round roundOne = new Round(pOneActionRound1, pTwoActionRound1);
		
		assertEquals(p1, roundOne.getRoundWinner());
		
	}
	
	
	public void testUpdateMatchWinsP1() {
		_sus = new Match();

		Player p1 = new Player("pTestOne");
		Player p2 = new Player("pTestOne");
		
		_sus.setPlayerOne(p1);
		_sus.setPlayerTwo(p2);
		
		_sus.setP1Wins(3);
		_sus.setP2Wins(1);
		
		assertEquals(p1, _sus.getMatchWinner());
		
	}
	
	public void testUpdateMatchWinsP2() {
		_sus = new Match();

		Player p1 = new Player("pTestOne");
		Player p2 = new Player("pTestOne");
		
		_sus.setPlayerOne(p1);
		_sus.setPlayerTwo(p2);
		
		_sus.setP1Wins(1);
		_sus.setP2Wins(5);
		
		assertEquals(p2, _sus.getMatchWinner());
		
	}
	
	


}