package corso.RockPaperScissors.model;

import java.util.concurrent.atomic.AtomicInteger;

import corso.RockPaperScissors.model.enums.Throw;

public class Round {

	private int idRound;
	private PlayerAction pOneAction;
	private PlayerAction pTwoAction;
	private final static AtomicInteger count = new AtomicInteger(0);

	public Round(PlayerAction pOneAction, PlayerAction pTwoAction) {
		setIdRound(count.incrementAndGet());
		this.setpOneAction(pOneAction);
		this.setpTwoAction(pTwoAction);
	}
	
	public int getIdRound() {
		return idRound;
	}

	public void setIdRound(int idRound) {
		this.idRound = idRound;
	}


	public Player getRoundWinner() {
		
		Player p1 = pOneAction.getPlayerOwner();
		Player p2 = pTwoAction.getPlayerOwner();
		
		Throw p1Throw = pOneAction.getThrowUsed();
		Throw p2Throw = pTwoAction.getThrowUsed();
		
		if (p1Throw == p2Throw) return null;
		
		if (p1Throw == Throw.ROCK) {
			if (p2Throw == Throw.PAPER) return p2;
			if (p2Throw == Throw.SCISSORS) return p1;
		}
	
		if (p1Throw == Throw.PAPER) {
			if (p2Throw == Throw.ROCK) return p1;
			if (p2Throw == Throw.SCISSORS) return p2;
		}
		return null; 	
		
	}

	public PlayerAction getpOneAction() {
		return pOneAction;
	}

	public void setpOneAction(PlayerAction pOneAction) {
		this.pOneAction = pOneAction;
	}

	public PlayerAction getpTwoAction() {
		return pTwoAction;
	}

	public void setpTwoAction(PlayerAction pTwoAction) {
		this.pTwoAction = pTwoAction;
	}
	
	
	

}
