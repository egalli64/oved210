package alessandraB.mar04;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCheck {
	
	public static void stringArrayListCheck()  {
	ArrayList<String> arrayList = new ArrayList<>();
	System.out.println(arrayList);
	}
	public static void arrayListCheck()  {
ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		System.out.println(arrayList);  //mi stampa [] per dire che è un array vuoto
		
        arrayList.add(12);  //metto 12 nella collezione
        arrayList.add(2);
        System.out.println(arrayList);  
        arrayList.add(0, 28);   //mette l'elemento nella posizione che voglio: index = la posizione, element = l'elemento
	    arrayList.add(3, -1);
        System.out.println(arrayList);
        
        // arrayList.clear(); //pulisce tutto quello che c'è nell'array, cioè toglie tutto
       //  System.out.println(arrayList);
        
        arrayList.contains(28);   // si usa per vedere se un elemento è contenuto nell'array
        if(arrayList.contains(28)); {
        System.out.println("There is a 28 in the array list");
        }
//      arrayList.ensureCapacity(minCapacity); // si assicura che il mio array possa contenere una determinata capacità di elementi
	  arrayList.get(3); {    // se voglio ottenere l'elemento in posizione 4 (si parte da 0)
	  System.out.println(arrayList.get(3));
	  System.out.println(arrayList.indexOf(12));  // ti stampa l'indice, ovvero la posizione,dell'elemento 12
	  System.out.println(arrayList.indexOf(33));
	  
	  
	  
	  arrayList.add(12);
	  System.out.println(arrayList);
	  System.out.println(arrayList.indexOf(12) + ", " + arrayList.lastIndexOf(12)); //lastIndxOf(12), mi stampa l'ultima posizione in cui sta 12
	 
	  System.out.println("****************");
	  
	 for(int i = 0; i < arrayList.size(); i++) {  //size è un po' come length.
	   Integer cur = arrayList.get(i);
	   if(cur %  2 == 0) {  //un numero è pari se diviso per 2 non da resto, ovvero il modulo % è = 0
		   System.out.println(cur);
	   }
	   }
	  
	  Iterator<Integer> it = arrayList.iterator();   //l'iteratore è una specie di rappresentazione di quello che è il puntatore
	  while(it.hasNext()) {  //hasNext verifica se l'iteratore ha un successore valido. L'iteratore per sua natura punta a 
		                     //una cella precedente alla prima cella esistente. Quindi con Next, mi prende la prima cella.
	  
		  Integer cur = it.next();
		  if(cur %  2 == 0) {  
			   System.out.println(cur);
		  }
		  }  
	  for (Integer cur : arrayList) {
		  if(cur % 2 == 0);
		  System.out.println(cur);
	  }
	  }
	  
	  //arrayList.clear();
	  //if(arrayList.isEmpty()) {  //ti stampa true se l'array risulta vuoto
		  //System.out.println("true");
	  
	  System.out.println(arrayList);
	  arrayList.remove(1);
	  System.out.println(arrayList); //stampa l'array rimuovendo l'elemento in posizione 1, cioè 2
	  
	  }

		
	public static void main(String[] args) {
		int [] array = {1, 4, 12, 27};   // = new int[4]; array[0] = 1; ...
		

		
	}  } 


