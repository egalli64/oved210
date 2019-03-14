package donatella.mar13;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeExamples {
	public static void treeSetExamples() {
		List<Integer> data=Arrays.asList(1,5,7,12,9);
		TreeSet<Integer> myTree= new TreeSet<>(data);
		System.out.println(myTree);
		
		System.out.println("Print my tree in natural order");
		Iterator<Integer>it=myTree.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		
		}
		System.out.println("Print my tree in reversed order");
		Iterator<Integer>dit=myTree.descendingIterator();
		while(dit.hasNext()) {
			System.out.println(dit.next());
		}
		myTree.add(42); 
		System.out.println(myTree);
		
		myTree.addAll(Arrays.asList(95,-7,-92));
		System.out.println(myTree);
		
		System.out.println(myTree.ceiling(42));
		System.out.println(myTree.ceiling(50));
		System.out.println(myTree.ceiling(100));
		System.out.println(myTree.floor(42));
		System.out.println(myTree.floor(50));
		System.out.println(myTree.floor(-100));
		
		myTree.clear();
		System.out.println(myTree);
		
		System.out.println(myTree.contains(42));
//		if(!myTree.contains(42)) {
			if(myTree.contains(42)==false) {
			System.out.println("My tree does not contain 42!");
			myTree.add(42);
			
		}
			System.out.println("The smallest elemebnt in my tree is:");
			System.out.println(myTree.first());
			System.out.println("The bigglest element in my tree is:");
			System.out.println(myTree.last());
			
			myTree.addAll(Arrays.asList(1,5,7,12,9));
			SortedSet<Integer>head=myTree.headSet(7);
//			[-92,-7]
			System.out.println(head);
			head=myTree.headSet(7,true);
//			[-92,-7,7]
			System.out.println(head);
			System.out.println(myTree.remove(1_000));
			System.out.println(myTree.remove(-92));
			
			System.out.println("My tree has"+ myTree.size()+ "elements");
			myTree.add(103);
			System.out.println("My tree has"+ myTree.size()+ "elements");
				
	}
public static void main(String[] args) {
//	treeSetExamples();
	treeMapExample();
	
//	System.out.println((int)Math.floor(42.45));
//	System.out.println((int)Math.ceil(42.45));
	
}
	public static void treeMapExample() {
		TreeMap<Integer,String> studentsById= new TreeMap<>();
		studentsById.put(12,"Tom");
		studentsById.put(42,"Tim");
		studentsById.put(27,"Sal");
		System.out.println(studentsById);
		
		Iterator it= studentsById.entrySet().iterator();
		
	Iterator<Map.Entry<Integer,String>> it1 =studentsById.entrySet().iterator();
	while (it1.hasNext()) {
		Map.Entry<Integer,String> entry=it1.next();
		if(entry.getValue().equals("Sal")) {
		System.out.println("Sal has id"+entry.getKey());
	
		
		
	}}}}
		
	


