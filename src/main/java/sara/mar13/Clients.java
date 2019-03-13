package sara.mar13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
		return clients.remove("Tom");
	}

	
//METODO PER ARRAY
	ArrayList<String> clientsStartingBy(char c) {

		String characterToString = Character.toString(c);
		String character2ToString = Character.toString((char) (c + 1));

		SortedSet<String> results = clients.subSet(characterToString, character2ToString);

		ArrayList<String> data = new ArrayList<>(results);
		return data;
	}

}
