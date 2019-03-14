package elmonda.Mar11;

import static org.junit.Assert.*;

import java.util.ArrayList;
import static org.hamcrest.core.Is.*;

import org.junit.Test;

public class MyIntegerStackTest {

	@Test
	public void testPushOne() {
		MyIntegerStack stack = new MyIntegerStack();
		stack.push(42);
		
		ArrayList<Integer> data = stack.getData();
		assertThat(data.size(), is(1)); // il mio arreylist dovrebbe avere 1 elemento , e quest'elemento dovrebbe essere 42
		assertThat(data.get(0), is(42));
	}
	
	@Test
	public void popOne() {   // pop devce eliminare l'ultimo elemento e ritornarmelo, la size sarà 0 e la pop sarà 42
		MyIntegerStack stack = new MyIntegerStack();
		ArrayList<Integer> data = stack.getData();  // prendo data da steck e verifico che sia fatto tutto correttamente
		data.add(42);
		
		Integer popped = stack.pop();  
		assertThat(data.size(), is(0)); // il mio arreylist dovrebbe avere 1 elemento , e quest'elemento dovrebbe essere 42
		assertThat(popped, is(42));

}
	
	@Test
	public void isEmptyTrue() {
		MyIntegerStack stack = new MyIntegerStack();
		assertTrue(stack.isEmpty()); 
	
}
	
	@Test
	public void isEmptyFalse() {
		MyIntegerStack stack = new MyIntegerStack();
		stack.push(42);
		
		
		assertFalse(stack.isEmpty()); 
		
}
	// cosa succede se cerco di fare un pop quando l'arrey è vuota? mi tira un'eccezione!
	@Test
	public void popEmpty( ) {
		MyIntegerStack stack = new MyIntegerStack();
		
		try {
			stack.pop(); // cerca di eseguire lo stack pop, siccome siamo in uno try catch tira la riga successiva e arriva alla riga assert that, verifica il messaggio
			fail("pop() should throw an exception here");   // se stack pop non tira l'eccezione esegue la riga successiva// associato
		} catch (IllegalAccessError iae) {
			assertThat(iae.getMessage(), is("Can't pop() an empty stack"));
		}
	}
	
}
