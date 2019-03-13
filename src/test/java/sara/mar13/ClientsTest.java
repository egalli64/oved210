package sara.mar13;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Test;

public class ClientsTest {

	@Test
	public void addOnlyMrX() {
		Clients clients = new Clients(); //creare oggetto clients
		clients.add("MrX"); //add di 1 elemento

		TreeSet<String> names = clients.getClients(); //verifica che ci sia 1 cliente
		assertThat(names.size(), is(1)); 
		
		assertTrue(names.contains("MrX")); //verifica che ci sia prorprio Mr
		
	}
//REMOVE QUANDO CLIENTE NON C'E'	
	@Test
	public void removeMrXWhenNotIn() {
		//cosa può fare l'utente part 1
		Clients clients = new Clients(); //clients -> oggetto che contiene i clienti (perchè non è metodo static)
		boolean removed = clients.remove("MrX");
		
		//verifica che non sia stato rimosso perchè non c'era proprio il cliente
		assertFalse(removed);
		
		TreeSet<String> names = clients.getClients(); //verifica che ci sia 0 clienti
		assertThat(names.size(), is(0));
	}
//REMOVE AGGIUNGENDO PRIMA IL CLIENTE	
	@Test
	public void addAndRemoveMrX() {
		//cosa può fare l'utente part 1
		Clients clients = new Clients();
		clients.add("MrX");
		boolean removed = clients.remove("MrX");
		
		//verifica che non sia stato rimosso perchè non c'era proprio il cliente
		assertTrue(removed);
		
		TreeSet<String> names = clients.getClients(); //verifica che ci sia 0 clienti
		assertThat(names.size(), is(0));
	}

	@Test
	public void removeMrX() {
		//cosa può fare l'utente part 1
		Clients clients = new Clients(); //clients -> oggetto che contiene i clienti (perchè non è metodo static)

		TreeSet<String> names = clients.getClients();
		names.add("MrX");
		
		//cosa può fare l'utente part 2
		boolean removed = clients.remove("MrX");
		assertTrue(removed);
		assertThat(names.size(), is(0));
	}
	

}
