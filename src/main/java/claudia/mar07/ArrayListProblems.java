package claudia.mar07;

import java.util.ArrayList;

public class ArrayListProblems {

	public static void removeDuplicates(ArrayList<String> data) {
		for (int i = 0; i < data.size() - 1; i++) {
			
			for (int j = i + 1; j < data.size(); j++) {
				
				if (data.get(i) == data.get(j)) {
					data.remove(j);
				}
			}
		}

	}

}
