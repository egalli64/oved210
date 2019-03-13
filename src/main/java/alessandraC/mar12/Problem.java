package alessandraC.mar12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Problem {
	public static int findUniqueSort(int[] data) {
		if (data == null || data.length % 2 == 0) {
			throw new IllegalAccessError("Bad input data");
		}

		Arrays.sort(data);

		for (int i = 1; i < data.length; i += 2) {
			if (data[i] != data[i - 1]) {
				return data[i - 1];
			}
		}
		return data[data.length - 1];

	}

	public static int findUniqueHash(int[] data) {
		if (data == null) {
			throw new IllegalStateException("Bad input data");

		}
		
		HashSet<Integer> hash = new HashSet <>();
		
		for(int i = 0; i < data.length; i++) {
			if(hash.contains(data[i])) {
				hash.remove(data[i]);
				
			}else {
				hash.add(data[i]);
			}
		
		
		
	
		if(hash.size() != 1) {
			throw new IllegalStateException("But input data");
}
		Iterator<Integer> it = hash.iterator();
			return it.next();
			
	}
	
		throw new IllegalStateException("Never reached");

}
}
