package finoacasa.entity;

import java.util.ArrayList;



public class Ristorante{
	
	private ArrayList<Pietanza> menu = new ArrayList<Pietanza>();
	private ArrayList<Ordine> archivio_ordini = new ArrayList<Ordine>(); //Lista degli ordini utile per il metodo genera_report() e per ricevere notifiche 
	
	private String nome;
	private String citta;
	private String via;
	private int num_civico;
	private String telefono;
	private String email;
	private Ristoratore proprietario;
	
	public Ristorante(String nome, String citta, String via, int num_civico, String telefono, String email, Ristoratore proprietario) {
		this.nome = nome;
		this.citta = citta;
		this.via = via;
		this.num_civico = num_civico;
		this.telefono = telefono;
		this.email = email;
		this.proprietario = proprietario;
	}
	
	public Ristorante(Ristorante r) {
		this.nome = r.nome;
		this.citta = r.citta;
		this.via = r.via;
		this.num_civico = r.num_civico;
		this.telefono = r.telefono;
		this.email = r.email;
		this.proprietario = r.proprietario;
	}
	
public String toString() {
		
		StringBuffer buf = new StringBuffer();
		
		buf.append("Nome: "  + this.nome + "\n");
		buf.append("Citta: " + this.citta + "\n");
		buf.append("Via: " + this.via + ", " + this.num_civico + "\n");
		buf.append("Telefono:" + this.telefono + " \n");
		buf.append("Email:" + this.email + " \n");
		buf.append("Proprietario:" + this.proprietario.getNome() + " \n");
		
		return buf.toString();
	}
	
	public ArrayList<Pietanza> getMenu(){
		return menu;
	}
	
	public ArrayList<Ordine> getArchivio_ordini(){
		return archivio_ordini;
	}
	
	public void setMenu(ArrayList<Pietanza> menu) {
		this.menu = menu;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCitta() {
		return citta;
	}
	
	public void setCitta(String citta) {
		this.citta = citta;
	}
	
	public String getVia() {
		return via;
	}
	
	public void setVia(String via) {
		this.via = via;
	}
	
	public int getNum_civico() {
		return num_civico;
	}
	
	public void setNum_civico(int num_civico) {
		this.num_civico = num_civico;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Ristoratore getProprietario() {
		return proprietario;
	}
	
	public void setProprietario(Ristoratore proprietario) {
		this.proprietario = proprietario;
	}
	
	public void agg_pietanza(String nome, String descrizione, int prezzo){
		menu.add( new Pietanza(nome, descrizione, prezzo) );
	}
	
	public void mod_pietanza(Pietanza p, String nome, String descrizione, int prezzo) {
		p.setNome(nome);
		p.setDescrizione(descrizione);
		p.setPrezzo(prezzo);
	}
	
	public void rim_pietanza(int pos) {
		menu.remove(pos);
	}
	
	public void agg_ordine(Ordine o, int mese){
		
		archivio_ordini.add(o);
		
	}
	
	public ArrayList<Ordine> cerca_ordini(int mese){//da 0 = Gennaio a 11 = Dicembre
		
		ArrayList<Ordine> ordini_trovati = new ArrayList<Ordine>();
		
		
		for(int i=0; i < archivio_ordini.size(); i++) {
			 
			
			if(archivio_ordini.get(i).getMese() == mese) {
			    ordini_trovati.add(archivio_ordini.get(i));
			}
		}
	    return ordini_trovati;	
	}
	
}