package finoacasa.entity;

public class OrdinazionePietanza {

	private int quantita;
	private Pietanza pietanza;
	
	public OrdinazionePietanza(Pietanza pietanza, int quantita) {
		this.quantita = quantita;
		this.pietanza = pietanza;
	}
	
	public String toString() {
		return "x" + this.quantita + " " + this.pietanza;
	}
	
	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public Pietanza getPietanza() {
		return pietanza;
	}

	public void setPietanza(Pietanza pietanza) {
		this.pietanza = pietanza;
	}

}