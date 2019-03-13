package alessandraC.mar13;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;


import org.hamcrest.core.Is;
import org.junit.Test;

public class ClientsTest {

	@Test
	public void addOnlyTom() {
		// what the user would do
		Clients clients = new Clients();
		clients.add("Tom");

		// verify that the previous call succeeded
		TreeSet<String> names = clients.getClients();
		assertEquals(1, names.size());
		assertTrue(names.contains("Tom"));

	}

	@Test
	public void removeTom() {
		// what the user would do - part 1
		Clients clients = new Clients();

		// simulation call to Clients.add()
		// calling directly TreeSet.add()
		TreeSet<String> names = clients.getClients();
		names.add("Tom");

		// what the user would do - part 2
		boolean removed = clients.remove("Tom");
		assertTrue(removed);
		assertThat(names.size(), is(0));
	}

	@Test
	public void clientStartingByT() {
		// what the user would do - part 1
		Clients clients = new Clients();

		// simulation call to Clients.add()
		// calling directly TreeSet.add()
		TreeSet<String> names = clients.getClients();
		names.addAll(Arrays.asList("Tom", "Tim", "Bill", "Wim"));
		

		// what the user would do - part 2
		ArrayList<String> tClients = clients.clientsStartingBy('T');

		// verify that the previous call succeeded
		assertThat(tClients.size(), is(2));
		assertTrue(tClients.contains("Tim"));
		assertFalse(tClients.contains("Tom"));

	}

}
