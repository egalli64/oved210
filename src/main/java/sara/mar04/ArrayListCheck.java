package sara.mar04;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCheck {
	public static void main(String[] args) {
		int[] array = { 1, 4, 12, 27}; 
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		System.out.println(arrayList);
		arrayList.add(12);
		arrayList.add(0,28);
		System.out.println(arrayList);
	    
		arrayList.clear();
		System.out.println(arrayList);
		//if(arrayList.isEmpty()) {
		//	System.out.println("Empty array!");
		//}
		
		if(arrayList.contains(28)) {
			System.out.println("There's a 28 in the array list");
		}
		
		
		System.out.println(arrayList.get(3));
		
		System.out.println(arrayList.indexOf(12));
		System.out.println(arrayList.indexOf(33));
		
		arrayList.add(12);
		System.out.println(arrayList);
		System.out.println(arrayList.indexOf(12) + "," + arrayList.lastIndexOf(12));
		
		for(int i =0; i < arrayList.size(); i++) {
			Integer cur = arrayList.get(i);
			if(cur % 2 == 0) {
				System.out.println(cur);
			}
		}
		//modo alternativo con Iterator per lavorare su collezioni(scandire collezioni)
		Iterator<Integer> it = arrayList.iterator(); //per vedere valore precedente
		while(it.hasNext()) {  //ultimo valore
			Integer cur = it.next(); //per vedere se c'è un valore successivo valido
			if(cur % 2 == 0) {
				System.out.println(cur);
			}
		}
		
		//alternativa ad Iterator
		for(Integer cur: arrayList) {
			if (cur % 2 == 0) {
				System.out.println(cur);
			}
		}
		
		System.out.println(arrayList);
		arrayList.remove(1);
		System.out.println(arrayList);
		
	}
}
