package marina.mar04;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCheck {
	public static void main(String[] args) {

		int[] array = { 1, 4, 12, 27 }; // =new int [4]; array [0] = 1; ...

		ArrayList<Integer> arrayList = new ArrayList<>();
		System.out.println(arrayList);
		arrayList.add(12);
		arrayList.add(2);
		System.out.println(arrayList);
		arrayList.add(1, 28);
		arrayList.add(3, -1);
		System.out.println(arrayList);

//		arrayList.clear();
//		System.out.println(arrayList);
	
		arrayList.contains(28);
		System.out.println("There is a 28 in the array list");

		System.out.println(arrayList.get(3));

		System.out.println(arrayList.indexOf(12));
		System.out.println(arrayList.indexOf(33));
		
		arrayList.add(12);
		System.out.println(arrayList);
		
		System.out.println(arrayList.indexOf(12) + "," + arrayList.lastIndexOf(12));
		
	
	
		for (int i=0; i < arrayList.size(); i++) {
			Integer cur = arrayList.get(i);
			if (cur % 2 == 0) {
				System.out.println(cur);
			}
		}

		Iterator<Integer> it = arrayList.iterator();
		while (it.hasNext()) {
			Integer cur = it.next();
			if (cur % 2 == 0) {
				System.out.println(cur);
			}
		}
		
		
		for (Integer cur : arrayList) {
			if (cur % 2 == 0) {
				System.out.println(cur);
			}
			
		}
		System.out.println(arrayList);
		arrayList.remove(1);
		arrayList.trimToSize();
		System.out.println(arrayList);
	}
}
