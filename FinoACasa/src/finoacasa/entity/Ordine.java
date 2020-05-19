package finoacasa.entity;

import java.util.ArrayList;
import java.util.Calendar;


public class Ordine{
	
	private static int contatore_id = 0;
	
	private int id;
	private ArrayList<OrdinazionePietanza> pietanze = new ArrayList<OrdinazionePietanza>();
	private int prezzo_totale;
	private int mese;
    private String stato;
	
	public Ordine(ArrayList<OrdinazionePietanza> pietanze, Calendar data) {    //costruttore usato come ordine provvisorio: non aumenta il contatore_id.
		
		this.id = -1;
		this.pietanze = pietanze;
		this.prezzo_totale = 0;
		
		
		this.mese = data.get(Calendar.MONTH);
		
	}
	
    public Ordine(Ordine o) {    
		
		this.id = ++contatore_id;
		this .pietanze = o.pietanze;
		this.prezzo_totale = o.prezzo_totale;
		this.mese = o.mese;
		this.stato = "in preparazione";
}
	
    public String toString() {
		
		StringBuffer buf = new StringBuffer();
		
		if(this.id!=-1) {
			buf.append("Ordine #" + this.id + "\n");
		    buf.append("Mese : " + this.mese + "\n");
		}
		
		buf.append("Pietanze: \n");
		
		for (int i = 0; i < this.pietanze.size(); i++ ) {
			buf.append(this.pietanze.get(i));
		}
		
		buf.append("prezzo totale: " + this.prezzo_totale + "€\n");
		if(this.stato!=null) {
			
			buf.append("Stato ordine: " + this.stato + "\n");
		}
		
		return buf.toString();
	}
	
    public ArrayList<OrdinazionePietanza> getPietanze() {
		return pietanze;
	}
    
    public int getMese() {
    	return mese;
    }
    
    public void calcolaPrezzo() {
		
		int totale = 0;
		
			
		for(int i = 0; i < pietanze.size(); i++) {
					
			int temp = pietanze.get(i).getPietanza().getPrezzo();
					
					temp = temp * pietanze.get(i).getQuantita();
					
					totale = totale + temp;
		}
		this.prezzo_totale = totale;
    }
    
}