package tiziana.mar13;

import java.util.ArrayList;

import java.util.SortedSet;
import java.util.TreeSet;

public class Clients {
	private TreeSet<String> clients;

	public Clients() {
		clients = new TreeSet<>();
	}

	/**
	 * for testing purpose only!
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

	ArrayList<String> clientsStartingBy(char c) {
		String x = String.valueOf(c);
		String y = String.valueOf((char) (c + 1));

		SortedSet<String> results = clients.subSet(x, y);

		ArrayList<String> data = new ArrayList<>(results);
		return data;
	}
}
