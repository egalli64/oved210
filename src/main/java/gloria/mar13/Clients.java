package gloria.mar13;

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
		clients.add("Tom");
	}

	public boolean remove(String client) {
//		return clients.remove("Tom");
		if (clients.remove("Tom")) {
			return true;
		}

		return false;
	}

	ArrayList<String> clientsStartingBy(char c) { // trasformo inizialmente il carattere in una stringa
		
		String begin = String.valueOf(c);
		String end = String.valueOf((char) (c + 1));
		SortedSet<String> results = clients.subSet(begin, end);
		
		ArrayList<String> data = new ArrayList<>(results);
		return data;		
	}
}
