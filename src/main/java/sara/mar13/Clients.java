package sara.mar13;

import java.util.ArrayList;
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
		clients.add("MrX");
	}

	public boolean remove(String client) {
			return clients.remove("MrX");	
		}

	ArrayList<String> clientStartingBy(char c) {
		ArrayList<String> list = new ArrayList<>();

		return list;

	}

}
