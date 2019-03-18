package alessandraC.mar18;

import java.util.HashMap;

public abstract class Another {
	public abstract void z();

}
//static public boolean isAnagramHash(String left, String right) {
//	HashMap<Character, Integer> counters = new HashMap<>();
//	for (int i = 0; i < left.length(); i++) {
//		Character key = left.charAt(i);
//		Integer value = counters.get(key);
//		if (value == null) {
//			value = 0;
//		}
//		counters.put(key, value + 1);
//	}
//
//	for (int i = 0; i < right.length(); i++) {
//		Character key = right.charAt(i);
//		Integer value = counters.get(key);
//		if (value == null || value.equals(0)) {
//			return false;
//		}
//		counters.put(key, value - 1);
//	}
//
//	for (int value : counters.values()) {
//		if (value != 0) {
//			return false;
//		}
//	}
//
//	return true;
//}
//
//
//}
//
