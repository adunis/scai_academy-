package corso.RockPaperScissors.model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Match {
   private int idMatch;
	private final static AtomicInteger count = new AtomicInteger(0);
    List<Round> listRounds;
    private Player playerOne; 
    private Player playerTwo; 
    private int p1Wins = 0;
    private int p2Wins = 0;
    
    public Match() {
		setIdMatch(count.incrementAndGet());
		listRounds = new ArrayList<Round>();
    }
    
    private void setIdMatch(int idMatch) {
    	this.idMatch = idMatch;
	}

    @SuppressWarnings("unused")
	private int getIdMatch() {
    	return idMatch;
	}
    
	public void updateMatch(Round round) {
    	addRound(round);
    	if (round.getRoundWinner().equals(playerOne)) {
    		setP1Wins(getP1Wins() + 1);
    	}
    	if (round.getRoundWinner().equals(playerTwo)) {
    		setP2Wins(getP2Wins() + 1);
    	}
    	if (round.getRoundWinner() == null){
    		return;
    	}
    }
    
    public void addRound(Round round) {
    	if (listRounds.size()== 0) {
    		setPlayerOne(round.getpOneAction().getPlayerOwner());
    		setPlayerTwo(round.getpTwoAction().getPlayerOwner());
    	}
    	listRounds.add(round);
    	
    }
    
    public Player getMatchWinner() {
		
    	if (p1Wins + p2Wins >= 3) {
    		if (p1Wins > p2Wins) {
    			return playerOne;
    		} 
    		if (p2Wins > p1Wins) {
    			return playerTwo;
    		}
    	}
		return null;
    }

	public int getP1Wins() {
		return p1Wins;
	}

	public void setP1Wins(int p1Wins) {
		this.p1Wins = p1Wins;
	}

	public int getP2Wins() {
		return p2Wins;
	}

	public void setP2Wins(int p2Wins) {
		this.p2Wins = p2Wins;
	}
   
	
	 public void setPlayerOne(Player player) {
		 this.playerOne = player;
	 }
	 
	 public Player getPlayerOne() {
		 return playerOne; 
	 }
	 
	 public void setPlayerTwo(Player player) {
		 this.playerTwo = player;
	 }
	 
	 public Player getPlayerTwo() {
		 return playerTwo;
	 }
	
	 public void setListrounds(List<Round> listRounds) {
		 this.listRounds = listRounds; 
	 }
	
	 public List<Round> getListRounds() {
		 return listRounds; 
	 }
	
}
