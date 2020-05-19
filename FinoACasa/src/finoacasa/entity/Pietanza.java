package finoacasa.entity;



public class Pietanza {

	private String nome;
	private String descrizione;
	private int prezzo;

	public Pietanza(String nome, String descrizione, int prezzo) {
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}
	
	public String toString() {
		return this.nome + " (" + this.descrizione + "), prezzo: " + this.prezzo + "€\n";
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

    public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
}