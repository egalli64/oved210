package elmonda.Mar11;

import java.util.ArrayList;
import java.util.Iterator;



public class CollectionExamples {
	public static void checkArrayList() {
		ArrayList<String> myStrings = new ArrayList<>();   // con array list conviene lavorare solo sull'estremo destro, con liked list su entrambi gli estremi
		
		myStrings.add("Hello");  // invece di dirgli metti hello  , gli dico add hello e lo aggiunge nella prima posizione libera
		myStrings.add(0, "First");   // (non è consigliato), perchè fa slittare di posto tutti gli elementi; mettimi nella posizione zero il valore first
		System.out.println(myStrings);
		
		ArrayList<String> al2 = new ArrayList<>();
		al2.addAll(myStrings);
		al2.clear();          // svuotami la collezione, per eliminare da mystring, scrivere mystring.clear
		System.out.println(myStrings + ", " + al2);

		ArrayList<String> al3 = new ArrayList<>(myStrings);  // tutte le stringhe che sono nella collezione mystrings, vengono aggiunte alla collezione string
		boolean al3HasFirst = al3.contains("First");  // contains è uhn metodo guarda se in al3 c'è una stringa con il valore "first", 
		// contains è un metodo e fa un loop for lineare
		System.out.println(al3HasFirst);       

		al3.add("another one");
		System.out.println(al3);
		boolean al3ContainsMyStrings=al3.containsAll(myStrings);
		System.out.println(al3ContainsMyStrings);
		
		
		for(int i = 0; i < al3.size(); i++) {
		
		System.out.println(al3.get(i));  // get è come se fosse la parentesi quadra degli arrey di basso livello // il get corrisponde alle parentesi quadre, se voglio stampare tutti gli elementi di al tre, posso fare
		        // for (int i = 0; i< al3
		
		
	}
		al3.add("First");
		System.out.println(al3.indexOf("First"));   // non molto utile per le linked list perchè non potro' andare dirett nella posizione, ma dovrà passarmeli tutti.//stampami l'indice di first, mi asprtto che mi stampi 0
		System.out.println(al3.lastIndexOf("First"));
		System.out.println(al3.lastIndexOf("Second"));
		
		Iterator<String> it = al3.iterator();  // mi serve a iterare su una collezione, come se facessi un for each, cio
		while (it.hasNext()) {
			System.out.println(it.next()); // è un modo alternativo per scandire il for, mi ritorna il valore contenuto nell'elemento successivo e mi sposta l'iteratore alla cella successiva
		}
		
		System.out.println(al3.isEmpty());// mi ritorna true se la collezione è vuota, in questo caso mi ritornerà false, perchè la colleizione non è vuota
		System.out.println(al3.size() == 0);
		
		al3.remove(0); //vai a prendere l'elemnto zero e rimuovilo, in questo modo sposterà tutti gli elementi a sinistra
		System.out.println(al3);
		
		
	}
		
	public static void main(String[] args) {
		checkArrayList();
	}
}
