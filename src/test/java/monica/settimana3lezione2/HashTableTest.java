package monica.settimana3lezione2;

import static org.junit.Assert.*;

import org.junit.Test;

import monica.settimana2.Problem;

public class HashTableTest {

	@Test
	public void findUniqueHash() {
		assertEquals(2, HashTable.findUniqueHash(new int[] { 2, 1, 1 }));
	}

	@Test
	public void findUniqueHashB() {
		assertEquals(42, HashTable.findUniqueHash(new int[] {-1027,12,-1027,12,42}));
	}
	
	

}
