package monica.settimana3lezione3;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

import org.junit.Test;

public class ClientsTest {

	// List<String> users = Arrays.asList ("Maurizio","Matteo","Marco");
	// TreeSet<String> clients = new TreeSet<>(users);

	@Test // per aggiungere cliente
	public void addClients() {

		Clients clients = new Clients(); // quello che fa un cliente qualsiasi
		clients.add("Tom");

		TreeSet<String> names = clients.getClients(); // in questo modo verifico se effettivamente è stato messo il
														// nuovo
														// cliente
		assertThat(names.size(), is(1));
		assertTrue(names.contains("Tom"));

	}

	@Test // questo invece quando c'è tom, cioè viene aggiunto e tolto
	public void addAndRemoveClients() {
		Clients clients = new Clients(); // costruttore
		TreeSet<String> names = clients.getClients();
		names.add("Tom");

		boolean removed = clients.remove("Tom");
		assertTrue(removed);

		assertThat(names.size(), is(0));

	}

	@Test // questo è quando non aggiunge nessuno neanche Tom
	public void removeTomWhenNotIt() {

		Clients clients = new Clients(); // costruttore

		boolean removed = clients.remove("Tom");
		assertFalse(removed);

		TreeSet<String> names = clients.getClients();
		assertThat(names.size(), is(0));
	}

	@Test
	public void clientsStartingBy () {   //chiediamo di tornarci i clienti con i nomi che iniziano per la lettera che vogliamo noi 
		Clients clients = new Clients();
		TreeSet<String> names = clients.getClients();
		names.add("Tim");
		names.add("Tom");
		names.add("Bill");
		names.add("Wim");     //potevamo anche scrivere -> names.addAll(Arrays.asList("Tom","Tim","Bill","Wim")
	
		ArrayList<String> tClients = clients.clientsStartingBy('T');
		assertThat(tClients.size(), is(2));
		assertTrue(tClients.contains("Tim"));
		assertTrue(tClients.contains("Tom"));
	
	
	
	}
	
	
}
