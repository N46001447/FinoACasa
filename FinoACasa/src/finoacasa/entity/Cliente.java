package finoacasa.entity;

public class Cliente extends Persona{
	
	private String carta;
	
	public Cliente(String nome, String cognome, String telefono, String carta) {
		super(nome,cognome,telefono);
		this.carta = carta;
	}
	
	public String getCarta() {
		return this.carta;
	}
	
	public void setCarta(String carta) {
		this.carta = carta;
	}
	
}