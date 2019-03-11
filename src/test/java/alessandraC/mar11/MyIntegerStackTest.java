package alessandraC.mar11;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

import java.util.ArrayList;

import org.junit.Test;

public class MyIntegerStackTest {

	@Test
	public void PushOne() {
		MyIntegerStack stack = new MyIntegerStack();
		stack.push(42);

		ArrayList<Integer> data = stack.getData();
		assertThat(data.size(), is(1));
		assertThat(data.get(0), is(42));
	}

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

}
