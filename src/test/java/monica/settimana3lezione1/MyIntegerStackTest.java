package monica.settimana3lezione1; // 11/03/2019

import static org.junit.Assert.*;

import java.util.ArrayList;

import static org.hamcrest.core.Is.*;
import org.junit.Test;

public class MyIntegerStackTest {

	@Test
	public void testPush() {
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
	public void testIsEmpty() {
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