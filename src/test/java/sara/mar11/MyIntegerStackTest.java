package sara.mar11;

import static org.junit.Assert.*;

import java.util.ArrayList;

import static org.hamcrest.core.Is.*;
import org.junit.Test;


public class MyIntegerStackTest {

	// Push di un elemento
	@Test
	public void PushOne() {
		MyIntegerStack stack = new MyIntegerStack();
		stack.push(42);

		ArrayList<Integer> data = stack.getData();
		assertThat(data.size(), is(1));
		assertThat(data.get(0), is(42));
	}

	// Pop di un elemento
	@Test
	public void PopOne() {
		MyIntegerStack stack = new MyIntegerStack();
		stack.push(42);

		Integer popped = stack.pop();
		ArrayList<Integer> data = stack.getData();
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
		stack.push(42);
		assertFalse(stack.isEmpty());
	}
	
	@Test
	public void popEmpty() {
		MyIntegerStack stack = new MyIntegerStack();

		try {
			stack.pop();
			fail("pop() should throw an exception here");
		} catch (IllegalAccessError iae) {
			assertThat(iae.getMessage(), is("Can't pop() an empty stack"));
		}
	}
}
