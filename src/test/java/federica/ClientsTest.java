package federica;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

import static org.hamcrest.core.Is.*;
import org.junit.Test;

public class ClientsTest {

	@Test
	public void addOnlyTom() {
		Clients clients = new Clients();
		clients.add("Tom");

		TreeSet<String> names = clients.getClients();
		assertThat(names.size(), is(1));
// oppure:assertEquals(1, names.size());
		names.contains("Tom");
		assertTrue(names.contains("Tom"));

	}

	@Test
	public void removeTomWhenNotIn() {
		Clients clients = new Clients();
//		TreeSet<String> clients = clients.getClients();
//      names.add("Tom");

		boolean removed = clients.remove("Tom");
		assertFalse(removed);

		TreeSet<String> names = clients.getClients();
		assertThat(names.size(), is(0));
	}

	@Test
	public void addAndRemoveTom() {
		Clients clients = new Clients();
		clients.add("Tom");

		boolean removed = clients.remove("Tom");
		assertTrue(removed);

		TreeSet<String> names = clients.getClients();
		assertThat(names.size(), is(0));
// in questo test Tom viene prima aggiunto e poi rimosso.
	}
	
	@Test
	public void startingBy() {
		Clients clients = new Clients();
		
		TreeSet<String> names = clients.getClients();
		names.addAll(Arrays.asList("Tim", "Tom", "Bill", "Wim"));
		
		ArrayList<String> tClients = clients.clientsStartingBy('T');
		assertThat(tClients.size(), is(2));
		assertTrue(tClients.contains("Tim"));
		assertTrue(tClients.contains("Tom"));
	}

	}
