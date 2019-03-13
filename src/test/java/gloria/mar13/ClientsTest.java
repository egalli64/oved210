package gloria.mar13;

import org.junit.Test;
import java.util.TreeSet;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class ClientsTest {

	@Test
	public void addOnlyTom() {
		// what the user would do
		Clients clients = new Clients();
		clients.add("Tom");

		// verify that the previous call succeeded
		TreeSet<String> names = clients.getClients();
		assertThat(names.size(), is(1));
		// assertEquals(1, names.size(1));
		assertTrue(names.contains("Tom"));
	}

	@Test
	public void TestRemove() {
		// what the user would do - part 1
		Clients clients = new Clients();

		// simulation call to Clients.add()
		// calling directly TreeSet.add()
//		TreeSet<String> names = clients.getClients();
//		names.add("Tom");

		// or, less clean but more clear
		clients.add("Tom");

		// what the user would do - part 2
		boolean removed = clients.remove("Tom");
		assertTrue(removed);
	}

	@Test
	public void removeTomWhenNotIt() {
		// what the user would do - part 1
		Clients clients = new Clients();
		boolean removed = clients.remove("Tom");

		// verify that the previous call succeeded
		assertFalse(removed);

		TreeSet<String> names = clients.getClients();
		assertThat(names.size(), is(0));
	}

	// simpler but dirtier
	@Test
	public void addAndRemoveTom() {
		// what the user would do - part 1
		Clients clients = new Clients();
		clients.add("Tom");
		boolean removed = clients.remove("Tom");

		// verify that the previous call succeeded
		assertTrue(removed);

		TreeSet<String> names = clients.getClients();
		assertThat(names.size(), is(0));
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

}
