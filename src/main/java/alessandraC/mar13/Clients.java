package alessandraC.mar13;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * ordinate the name of client in alphabetic order create an Array List with the
 * order name
 * 
 * @param client
 * @return
 */

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
//			return clients.remove(client);

		if (clients.remove(client)) {
			return true;
		}
		return false;
	}

	ArrayList<String> clientsStartingBy(char c) {
		String begin = String.valueOf(c);
		String end = String.valueOf((char) (c + 1));
		SortedSet<String> results = clients.subSet(begin, end);
		
		
		ArrayList<String> list = new ArrayList<> (results);
		
		return list;
		
		
		
		
		
		
		
	
	

		
	}

	
		
	}


