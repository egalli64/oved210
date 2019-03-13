package sara.mar13;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

import org.junit.Test;

public class ClientsTest {

	@Test
	public void addOnlyTom() {
		Clients clients = new Clients(); //creare oggetto clients
		clients.add("Tom"); //add di 1 elemento

		TreeSet<String> names = clients.getClients(); //verifica che ci sia 1 cliente
		assertThat(names.size(), is(1)); 
		
		assertTrue(names.contains("Tom")); //verifica che ci sia prorprio Mr
		
	}
//REMOVE QUANDO CLIENTE NON C'E'	
	@Test
	public void removeTomWhenNotIn() {
		//cosa può fare l'utente part 1
		Clients clients = new Clients(); //clients -> oggetto che contiene i clienti (perchè non è metodo static)
		boolean removed = clients.remove("Tom");
		
		//verifica che non sia stato rimosso perchè non c'era proprio il cliente
		assertFalse(removed);
		
		TreeSet<String> names = clients.getClients(); //verifica che ci sia 0 clienti
		assertThat(names.size(), is(0));
	}
//REMOVE AGGIUNGENDO PRIMA IL CLIENTE	
	@Test
	public void addAndRemoveTom() {
		//cosa può fare l'utente part 1
		Clients clients = new Clients();
		clients.add("Tom");
		boolean removed = clients.remove("Tom");
		
		//verifica che non sia stato rimosso perchè non c'era proprio il cliente
		assertTrue(removed);
		
		TreeSet<String> names = clients.getClients(); //verifica che ci sia 0 clienti
		assertThat(names.size(), is(0));
	}

	@Test
	public void removeTom() {
		//cosa può fare l'utente part 1
		Clients clients = new Clients(); //clients -> oggetto che contiene i clienti (perchè non è metodo static)

		TreeSet<String> names = clients.getClients();
		names.add("Tom");
		
		//cosa può fare l'utente part 2
		boolean removed = clients.remove("Tom");
		assertTrue(removed);
		assertThat(names.size(), is(0));
	}
	@Test
	public void clientsStartingByT() {
		Clients clients = new Clients(); 
		
		TreeSet<String> names = clients.getClients();
		names.addAll(Arrays.asList("Tom", "Tim", "Bill", "Will"));
		
		
		ArrayList<String> tClients = clients.clientsStartingBy('T');
		
		assertThat(tClients.size(), is(2));
		assertTrue(tClients.contains("Tim"));
		assertTrue(tClients.contains("Tom"));
		
	}
	

}
