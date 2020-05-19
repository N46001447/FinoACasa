package finoacasa;

import java.util.*;

import finoacasa.control.*;
import finoacasa.entity.OrdinazionePietanza;
import finoacasa.entity.Pietanza;
import finoacasa.entity.Ristorante;

public class Main {

	public static void main(String[] args) {
		
		Calendar localdata = Calendar.getInstance();;
		GestioneOrdini ord = new GestioneOrdini();
		
		
		ArrayList<Ristorante> ristoranti_trovati = ord.ricerca_ristoranti("Napoli", "Via Lunga", 3);
		
	        //	
			//Simula una scelta del ristorante
			//
			
			
			Ristorante ristorante_scelto = ristoranti_trovati.get(0);  //scelto il primo ristorante
		    
			ArrayList<Pietanza> menu = ristorante_scelto.getMenu();
			System.out.println(menu + "\n");
			
			
			//
			//Simula una scelta delle pietanze
			//
			
			ArrayList<OrdinazionePietanza> pietanze = new ArrayList<OrdinazionePietanza>();
			pietanze.add(new OrdinazionePietanza(menu.get(0), 2));   //margherita x2
			pietanze.add(new OrdinazionePietanza(menu.get(2), 1));   //pizza ananas x1
			
			
			
			ord.effettua_ordine(pietanze, localdata);
			
		
	}
}