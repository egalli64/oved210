package claudia.mar13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
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

		return clients.remove(client);

	}

	ArrayList<String> clientsStartingBy(char c) {
	
		String begin = String.valueOf((char)c);
		String end = String.valueOf((char)(c + 1));
		
		SortedSet<String> x = clients.subSet(begin, end);
	
		ArrayList<String> list = new ArrayList<>(x);

		return list;
	}
}