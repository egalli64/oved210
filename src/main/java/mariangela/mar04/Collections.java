package mariangela.mar04;

import java.util.ArrayList;
import java.util.Iterator;

public class Collections {
	public static void main(String[] args) {
		int[] array = { 1, 4, 12, 27 }; // = new int [4]; array[0] = 1; ....
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		System.out.println(arrayList);
		arrayList.add(12);
		arrayList.add(2);
		System.out.println(arrayList);
		arrayList.add(0, 28);// se voglio mantenere l'ordine decrescente inserisco in quale posizione volgio inserire il 28
		arrayList.add(3, -1);
		System.out.println(arrayList);
		
		for(int i = 0; 1 < arrayList.size(); i++) {
			Integer cur = arrayList.get(i);
			if(cur % 2 == 0) {
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
	}
}
