package mariangela.mar11;

import static org.junit.Assert.*;

import static org.hamcrest.core.Is.*;

import java.util.ArrayList;

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
	public void testPop() {
		MyIntegerStack stack = new MyIntegerStack();
		stack.push(42);
		Integer popped = stack.pop();

		ArrayList<Integer> data = stack.getData();
		assertThat(data.size(), is(0));
		assertThat(popped, is(42));
	}
	@Test
	public void testPopEmpty() {
		MyIntegerStack stack = new MyIntegerStack();
		try {
			stack.pop();
			fail("pop() should throw an exception here");
		} catch (IllegalAccessError iae) {
			assertThat(iae.getMessage(), is("Can't pop() an empty stack"));			
		}
	
	}
	
	@Test
	public void testIsEmptyTrue() {
		MyIntegerStack stack = new MyIntegerStack();

		assertTrue(stack.isEmpty());
	}

	@Test
	public void testIsEmptyFalse() {
		MyIntegerStack stack = new MyIntegerStack();
		stack.push(42);

		assertFalse(stack.isEmpty());
	}
}
