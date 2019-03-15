package monica.settimana3lezione3; //13/03/19 TreeSet esercizio n.1

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Clients {

	private TreeSet<String> clients;

	public Clients() {
		clients = new TreeSet<>();
	}

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
		String begin = String.valueOf(c);
		String end = String.valueOf((char) (c + 1));
		SortedSet<String> initial = clients.subSet(begin, end);

		ArrayList<String> list = new ArrayList<>(initial);
		return list;
	}

}
