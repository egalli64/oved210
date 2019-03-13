package alessandraC.mar13;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.hamcrest.Matcher;
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
		clients.add("Tom");

		boolean removed = clients.remove("Tom");
		// verify that the previous call succeeded
		assertTrue(removed);

		TreeSet<String> names = clients.getClients();
		assertThat(names.size(), is(0));

	}

	private Matcher is(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
