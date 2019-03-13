package marina.mar13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Clients {

	private TreeSet<String> clients;

	public Clients() {

		clients = new TreeSet<>();
	}

	/**
	 * For testing purpose only!
	 */

	TreeSet<String> getClients() {

		return clients;
	}

	public void add(String client) {

		clients.add(client);
	}

	public boolean remove(String client) {

		if (clients.remove(client)) {
			return true;
		}
		return false;
	}

	// return clients.remove(client);

	ArrayList<String> clientsStartingBy(char c) {

		String x = String.valueOf(c);
		String y = String.valueOf((char) (c + 1));

		SortedSet<String> results = clients.subSet(x, y);

		ArrayList<String> list = new ArrayList<>(results);
		return list;

	}

}
