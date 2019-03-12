package tiziana.mar11;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import java.util.ArrayList;
import org.junit.Test;

import trainer.mar11.MyIntegerStack;

public class MyIntegerStackTest {

	@Test
	public void testPushOne() {
		MyIntegerStack stack = new MyIntegerStack();
		stack.push(42);

		ArrayList<Integer> data = stack();
		assertThat(data.size(), is(1));
		assertThat(data.get(0), is(42));
	}

	private ArrayList<Integer> stack() {
		return null;
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
	public void testisEmptyTrue() {
		MyIntegerStack stack = new MyIntegerStack();
		assertTrue(stack.isEmpty());

	}

	@Test
	public void testisEmptyFalse() {
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
