package claudia.mar13;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.TreeSet;

import org.junit.Test;

public class ClientsTest {

	@Test
	public void testAddOnlyTom() {
		Clients clients = new Clients();
		clients.add("Tom");
		
		TreeSet<String> names = clients.getClients();
		
		assertThat(names.size(), is(1));
		assertTrue(names.contains("Tom"));
	}
	@Test
	public void testRemoveTom() {
		Clients clients = new Clients();
		
		TreeSet<String> names = clients.getClients();
		names.add("Tom");
		
		boolean removed = clients.remove("Tom");
		assertTrue(removed);
}
	@Test
	public void testRemoveTomWhenNotIn() {
	Clients clients = new Clients();
	
	boolean removed = clients.remove("Tom");
	assertFalse(removed);
	
	TreeSet<String> names = clients.getClients();
	assertThat(names.size(), is(0));
}
	@Test
	public void testClientsStartingByT() {
		Clients clients = new Clients();
		
		// internal testing stuff
		TreeSet<String> names = clients.getClients();
		names.add("Tim");
		names.add("Tom");
		names.add("Bill");
		names.add("Will");
		
		// user call
		ArrayList<String> tClients = clients.clientsStartingBy('T');
		
		// test
		assertThat(tClients.size(), is(2));
		assertTrue(tClients.contains("Tim"));
		assertTrue(tClients.contains("Tom"));
	}
}