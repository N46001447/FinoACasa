package finoacasa.control;

import java.util.ArrayList;
import java.util.Calendar;


import finoacasa.entity.*;





public class GestioneOrdini{
	
	private ArrayList<Ristorante> ristoranti = new ArrayList<Ristorante>();
	
	
	
	public GestioneOrdini() {
		
		
		
		ristoranti.add(new Ristorante("Just Pizza", "Napoli", "Via Lunga", 63, "081223344", "justpizza@libero.it", new Ristoratore("Paolo", "Goffo", "3392622008")) );
		ristoranti.add(new Ristorante("Just Pollo", "Napoli", "Via Lunga", 42, "081663344", "justpollo@libero.it", new Ristoratore("Aldo", "Baffo", "3392622372")) );
		
		ristoranti.get(0).agg_pietanza("margherita", "buona", 5);
		ristoranti.get(0).agg_pietanza("marinara", "meglio", 4);
		ristoranti.get(0).agg_pietanza("margherita ananas", "non ci siamo", 7);
		ristoranti.get(1).agg_pietanza("polloburger", "non ha sofferto", 6);
		ristoranti.get(1).agg_pietanza("ali di pollo", "tanto non volano", 10);
		ristoranti.get(1).agg_pietanza("testa di pollo", "Cosa?", 15);
	}
	
	
	
	public ArrayList<Ristorante> getRistoranti(){
		return ristoranti;
	}
	
	public ArrayList<Ristorante> ricerca_ristoranti( String citta, String via, int num_civico) {
		
		ArrayList<Ristorante> ristoranti_trovati = new ArrayList<Ristorante>(); 
		for(int i=0 ; i < ristoranti.size() ; i++) {
			
		
			
		    //
		    //Simula una ricerca dei ristoranti vicini
		    //
			if(citta == ristoranti.get(i).getCitta() && via == ristoranti.get(i).getVia())
			ristoranti_trovati.add(ristoranti.get(i));
		
		}
		
		
		
		
		System.out.println(ristoranti_trovati.size() + " ristoranti nelle vicinanze: \n");
			
		for (int i = 0; i < ristoranti_trovati.size(); i++ ) {
				
			System.out.println(ristoranti.get(i) );
		}
		return ristoranti_trovati;
		
	}
			
		
	public void effettua_ordine(ArrayList <OrdinazionePietanza> pietanze, Calendar data) {
		
		Ordine temp = new Ordine(pietanze, data);
		temp.calcolaPrezzo();
		System.out.println(temp);
		
		//
		//Conferma
		//
		
		if(true) {
			Ordine ordine = new Ordine(temp);
			
			//Pagamento
			
			System.out.println("Ordine confermato:\n" + ordine);
			this.notifica_ristorante();
		}
		
		
		
		
		
	}

	public void notifica_ristorante() {
		//TODO
	}
	
	public void notifica_consegna() {
		//TODO
	}
	
	public void genera_report(String nome_ristorante, int mese) {
		boolean trovato = false;
		Ristorante ristorante_trovato = null;
		for(int i=0; i<ristoranti.size() && !trovato; i++) {
			if(nome_ristorante == ristoranti.get(i).getNome()) {
				ristorante_trovato = ristoranti.get(i);
				trovato = true;
			}
		}
		ArrayList<Ordine> ordini_trovati = ristorante_trovato.cerca_ordini(mese);
		System.out.println("Ordini di " + nome_ristorante + " nel mese numero " + (mese+1) + ":\n");
		System.out.println(ordini_trovati + "\n");
	}
	
	
	
}