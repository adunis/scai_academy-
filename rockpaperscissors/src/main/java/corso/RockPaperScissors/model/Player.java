package corso.RockPaperScissors.model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Player {
	private int idPlayer;
	private String userName;
	private List<Match> matchRecord;
    private final static AtomicInteger count = new AtomicInteger(0);
	
	public Player (String userName) {
		setIdPlayer(count.incrementAndGet());
		setUserName(userName); 
		setMatchRecord(new ArrayList<Match>());
	}
	
	public List<Match> getMatchRecord() {
		return matchRecord;
	}


	public void setMatchRecord(List<Match> matchRecord) {
		this.matchRecord = matchRecord;
	}

	public void addMatch(Match match) {
		this.matchRecord.add(match);
	}
	

	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getIdPlayer() {
		return idPlayer;
	}

	public void setIdPlayer(int idPlayer) {
		this.idPlayer = idPlayer;
	}

}
