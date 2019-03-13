package elmonda.mar13;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.SortedSet;
import java.util.TreeSet;

import static org.hamcrest.core.Is.*;

import org.junit.Test;

public class ClientsTest {

	@Test
	public void addOnlyTom() {
		//what the user would do   // che codice userebbe un altra persona ? devo verificare cosa succede se lui chiama il mio metodo add
		Clients clients = new Clients(); // ho creato l'oggetto con l'elenco vuoto// voglio che tom venga aggiunto nel mio stato privato dellla cdlasse
		clients.add("Tom"); // dopo l'add ci dovrebbe essere un solo elemento
		
		
		
		
		//verify that the previous call succeeded
		TreeSet<String> names = clients.getClients(); // vado  a prendere i clients come sono contenuti nel mio oggetto clients, il treeset me lo mette in una variabile locale, cosi lo posso usare
		assertThat(names.size(), is(1)); //e dico cosa mi aspetto? mi aspetto che names.size sia =  a 1 quindi faccio un assert
		//assertEquals(1, names.size());
		//names.first();
		assertTrue(names.contains("Tom"));
	}

@Test
public void removeTomWhenNotIn() {
	//what the user would do  - part 1
	Clients clients = new Clients();
	boolean removed = clients.remove("Tom");
			
	//verify that the previous call succeded
			assertFalse(removed);
	
	TreeSet<String> names = clients.getClients();
	assertThat(names.size(), is(0));
}
	

	@Test
	public void addAndRemoveTom() {   // verifica che funzioni l'aggiunta e la rimozione di Tom
		//what the user would do  - part 1
		Clients clients = new Clients();
		
		// abbiamo bisogno di una fase di inizializzazione, simuliamo che sia stata fatta un add
		//simulation call to Clients.add()
		// calling directly TreeSet.add()
		
//		TreeSet<String> names = clients.getClients();
//		names.add("Tom");
		
		
		// or, less clean but more clear
		 clients.add("Tom");
		
		// l'utente mi chiama clients
		// voglio che la remove funzioni e mi ritorni true, quindi il primo assert che faccio voglio che sia true, per segbnalare che tom è sttao effettivam rimosso
		boolean removed = clients.remove("Tom");
		
		// (verify that the previous call succeeded) deveo verificare che la rimozione abbia avuto successo
		assertTrue(removed);
		
		TreeSet<String> names = clients.getClients();
		assertThat(names.size(), is(0));
	}
	
	@Test
	public void testClientsStartingBy() {
		//what the user would do - part 1
		Clients clients = new Clients();
		
		//simulation call to Clients.add()
		//calling directly TreeSet.add()
		TreeSet<String> names = clients.getClients();
		names.addAll(Arrays.asList("Tom", "Tim", "Bill", "Wim"));
	 		
		// what the user would do - part 2
				ArrayList<String> tClients = clients.clientsStartingBy('T');
				//SortedSet<String> head = clients.headSet("U");
				
//				System.out.println(head);
//				System.out.println(head.tailSet("T"));
		
		//verify that the previous call succeeded
		assertThat(tClients.size(), is(2)); // mi aspetto che i clienti ritornati siano due  e che siano tim e tom.
		assertTrue(tClients.contains("Tim"));
		assertTrue(tClients.contains("Tom"));
	 
		
	}	
	}

