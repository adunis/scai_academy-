package main.java.negozio.model;

public class Prodotto {
    private String nome; 
    private double prezzo;
    private int numeroVendite;
    private int giacenza;

    Prodotto(String nome, double prezzo, int giacenza){
        this.nome = nome;
        this.prezzo = prezzo;
        this.giacenza = giacenza;
    }

	public int getGiacenza() {
		return giacenza;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getNumeroVendite() {
		return numeroVendite;
	}
	public void setNumeroVendite(int numeroVendite) {
		this.numeroVendite = numeroVendite;
	}
	public void setGiacenza(int giacenza) {
		this.giacenza = giacenza;
	}
}

