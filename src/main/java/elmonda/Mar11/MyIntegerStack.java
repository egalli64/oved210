package elmonda.Mar11;

import java.util.ArrayList;
// vogliamo implementare uno stack

public class MyIntegerStack {  // la voglio implementare usando un'arraylist
	private ArrayList<Integer> data;
	
	public MyIntegerStack() {      //ho la mia classse myIntegerStack basata su un'arrayList, quindi i miei metodi dovranno usare questa arreyList, devo implementare push pop e isempty
		data = new ArrayList<Integer>(); // data mi descrive lo stato della classe, se metto oggetti vanno a finire in data
	}
	/**
	 * For debugging and testing purpose only!
	 * 
	 * @return data
	 */
	
	// facciamo un metodo visibilità package che mi ritorni la mia arraylist
	ArrayList<Integer> getData() {
		return this.data;
	}
	
	public void push(Integer value) {  // con push metterò un elemento in data;
		data.add(value);  // data add con il valore che gli viene passato

}

	public Integer pop() {  // mi ritorna l'elemnto in cima allo stack e lo toglie dallo stack
		if (data.isEmpty()) {
			throw new IllegalAccessError("Can't pop() an empty stack");   // non eseguire se lo stack è vuoto
		}
		return data.remove(data.size() - 1);
	}
	 public boolean isEmpty() {  // guarda se array è vuota
		 if (data.isEmpty()) {

				return true;
			}

			return false;
		}

	}
