package claudia.mar15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Problems {
private static final int List = 0;


//	{1, 1, 1, 4, 5, 6, 4, 6, 5} -> {1, 4, 6, 5}
//	{} -> {}
//	null -> exception o {}
//	{1, 1, 1, 1, 1, 1, 1, 1, 1} -> {1}

	public static List<Integer> killDuplicates(List<Integer> data) {
		if (data == null || data.isEmpty()) {
			return Collections.emptyList();
		}
		ArrayList<Integer> buffer = new ArrayList<Integer>(data);
		buffer.sort(null);

		ArrayList<Integer> result = new ArrayList<Integer>();
		Integer previous = buffer.get(0);
		result.add(previous);
		for (int i = 1; i < buffer.size(); i++) {
			Integer current = buffer.get(i);
			if (!current.equals(previous)) {
				result.add(current);
				previous = current;
			}

		}
		return result;
		}
	
	
public static List<Integer> killDuplicatesHash(List<Integer> data){
	if(data == null) {
		return Collections.emptyList();
	}
	HashSet<Integer> hashData = new HashSet<>(data);
	List<Integer> result = new ArrayList<Integer>(hashData);
	return result;
	
}}
	
