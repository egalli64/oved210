package francesca.mar11;

import static org.junit.Assert.*;

import java.util.ArrayList;

import static org.hamcrest.core.Is.*;
import org.junit.Test;

public class MyIntegerStackTest {

	@Test
	public void pushOne() {
		MyIntegerStack stack = new MyIntegerStack();
		stack.push(42);
		
		
		ArrayList<Integer> data = stack.getData();
		assertThat(data.size(), is(1));
		assertThat(data.get(0), is(42));
	}


	@Test
	public void PopOne() {
		MyIntegerStack stack = new MyIntegerStack();
		ArrayList<Integer> data = stack.getData();
		data.add(42);
		
		Integer popped = stack.pop();
		assertThat(data.size(), is(0));
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
		assertFalse(stack.isEmpty());
	
	}
}
