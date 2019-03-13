package trainer.mar13;

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
		
	}
	
	public boolean remove(String client) {
		return false;
	}
	
	ArrayList<String> clientsStartingBy(char c) {
		ArrayList<String> list = new ArrayList<>();
		
		return list;
	}
}
