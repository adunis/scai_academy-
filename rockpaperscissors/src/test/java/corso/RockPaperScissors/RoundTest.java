package corso.RockPaperScissors;

import corso.RockPaperScissors.model.*;
import corso.RockPaperScissors.model.enums.Throw;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class RoundTest extends TestCase {

	public Round _sus;
	Match match = new Match();

	public RoundTest(String testname) {
		super(testname);
	}

	public static Test suite() {
		return new TestSuite(RoundTest.class);
	}

	public void testRoundCreation() {

		PlayerAction playerOneAction = new PlayerAction(new Player("pTestOne"), Throw.PAPER);
		PlayerAction playerTwoAction = new PlayerAction(new Player("pTestTwo"), Throw.ROCK);
		_sus = new Round(playerOneAction, playerTwoAction);

		assertEquals(_sus.getpOneAction(), playerOneAction);
		assertEquals(_sus.getpTwoAction(), playerTwoAction);

	}

	public void testGetRoundWinnerPaperVsRock() {
		PlayerAction playerOneAction = new PlayerAction(new Player("pTestOne"), Throw.PAPER);
		PlayerAction playerTwoAction = new PlayerAction(new Player("pTestTwo"), Throw.ROCK);
		_sus = new Round(playerOneAction, playerTwoAction);
		Player p1 = playerOneAction.getPlayerOwner();
		assertEquals(p1, _sus.getRoundWinner());
	}

	public void testGetRoundWinnerPaperVsScissors() {
		PlayerAction playerOneAction = new PlayerAction(new Player("pTestOne"), Throw.PAPER);
		PlayerAction playerTwoAction = new PlayerAction(new Player("pTestTwo"), Throw.SCISSORS);
		_sus = new Round(playerOneAction, playerTwoAction);
		Player p2 = playerTwoAction.getPlayerOwner();

		assertEquals(p2, _sus.getRoundWinner());
	}

	public void testGetRoundWinnerPaperVsPaper() {
		PlayerAction playerOneAction = new PlayerAction(new Player("pTestOne"), Throw.PAPER);
		PlayerAction playerTwoAction = new PlayerAction(new Player("pTestTwo"), Throw.PAPER);
		_sus = new Round(playerOneAction, playerTwoAction);

		assertEquals(null, _sus.getRoundWinner());
	}

}
