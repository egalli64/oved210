package mariangela.mar13;

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
//		assertEquals(1, names.size());
		assertTrue(names.contains("Tom"));
	}

	@Test
	public void testRemove() {
		Clients clients = new Clients();

//		TreeSet<String> names = clients.getClients();
//		names.add("Tom");
		clients.add("Tom");

		boolean removed = clients.remove("Tom");
		assertTrue(removed);
	}

	@Test
	public void removeTomWhewnNotIn() {
		Clients clients = new Clients();

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
	}
	@Test
	public void clientsStartingByT() {
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
		assertTrue(tClients.contains("Tom"));
	}
}