package sara.mar04;

import java.util.ArrayList;

public class Collections {
	public static void main(String[] args) {
		int[] array = { 1, 4, 12, 27}; //altrimenti -> = new int[4]; array[0] = 1; ...
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		System.out.println(arrayList);
		arrayList.add(12);
		System.out.println(arrayList);
		arrayList.add(0, 28);
		System.out.println(arrayList);
		
		arrayList.clear();
		System.out.println(arrayList);
		
		if(arrayList.contains(28)) {
			System.out.println("There's a 28 in the array list");
		}
		
		
	}
}
