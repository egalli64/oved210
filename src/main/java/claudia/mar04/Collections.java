package claudia.mar04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;



public class Collections {
	public static void doubleLinkedListCheck( ) {
		LinkedList<Double> linkedList = new LinkedList<>();
		linkedList.add(2.5);
		linkedList.addFirst(3.4);
		linkedList.addLast(5.6);
		
		System.out.println(linkedList);
		System.out.println(linkedList.peekFirst() + "," + linkedList.peekLast());
		
	}
	public static void main(String[] args) {
		doubleLinkedListCheck();
		
	}
	 {int[]array = {1, 4, 12, 27};
	
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	System.out.println(arrayList);
	
	arrayList.add(12);
	System.out.println(arrayList);
	arrayList.add(2);
	System.out.println(arrayList);
	arrayList.add(0, 28);
	System.out.println(arrayList);
	arrayList.add(3, -1);
	System.out.println(arrayList);
	
	
	if(arrayList.contains(-1)) {
		System.out.println("There's a -1 in the array list");
		System.out.println(arrayList.get(3));
		System.out.println(arrayList.indexOf(12));
		System.out.println(arrayList.indexOf(33));
		
		arrayList.add(12);
		System.out.println(arrayList);
		System.out.println(arrayList.indexOf(12) + ", "+ arrayList.lastIndexOf(12));
		
		for(int i = 0; i < arrayList.size(); i++) {
		Integer cur = arrayList.get(i);
		if(cur % 2 == 0) {
		System.out.println(cur);
			}
	
		}
		
		Iterator<Integer> it = arrayList.iterator();
		while(it.hasNext()) {
		Integer cur = it.next();
		if(cur % 2 == 0) {
		System.out.println(cur);
			
		}
	}
		for(Integer cur: arrayList) {
			if(cur % 2 == 0) {
			System.out.println(cur);
		}
}
		if(arrayList.isEmpty()) {
			System.out.println("Empty array!");
		}
}
	System.out.println(arrayList);
	arrayList.remove(1);
	System.out.println(arrayList);
}}
