package corso.RockPaperScissors.model;

import java.util.concurrent.atomic.AtomicInteger;

import corso.RockPaperScissors.model.enums.Throw;

public class PlayerAction {

	private int idPlayerAction; 
	private final static AtomicInteger count = new AtomicInteger(0); 
	private Player playerOwner; 
	private Throw throwUsed;
	
	public PlayerAction(Player playerOwner, Throw throwUsed) {
		setIdPlayerAction(count.incrementAndGet());
		setPlayerOwner(playerOwner);
		setThrowUsed(throwUsed);
	}
	
	public Player getPlayerOwner() {
		return playerOwner;
	}
	public void setPlayerOwner(Player playerOwner) {
		this.playerOwner = playerOwner;
	}
	public Throw getThrowUsed() {
		return throwUsed;
	}
	public void setThrowUsed(Throw throwUsed) {
		this.throwUsed = throwUsed;
	}

	public static AtomicInteger getCount() {
		return count;
	}

	public int getIdPlayerAction() {
		return idPlayerAction;
	}

	public void setIdPlayerAction(int idPlayerAction) {
		this.idPlayerAction = idPlayerAction;
	}

	
}
