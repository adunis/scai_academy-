package main.java.negozio.model;

public class Cliente {
    private String id;
    private int counterAcquisti;

    void compraProdotti(List<Prodotto> prodotti){
        
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCounterAcquisti() {
		return counterAcquisti;
	}

	public void setCounterAcquisti(int counterAcquisti) {
		this.counterAcquisti = counterAcquisti;
	}

}