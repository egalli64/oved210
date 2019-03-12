package monica.settimana3lezione1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Test;


import static org.hamcrest.core.Is.*;

public class MyIntegerQueueTest {

	@Test
	public void enqueueOne() {
		MyIntegerQueue queue = new MyIntegerQueue();
		queue.enqueue(42);

		LinkedList<Integer> data = queue.getData();
		assertThat(data.size(), is(1));
		assertThat(data.get(0), is(42));
	}
	@Test
	public void dequeueEmpty() {
		MyIntegerQueue queue = new MyIntegerQueue();

		try {
			queue.dequeue();
			fail("dequeue() should throw an exception here");
		} catch (IllegalAccessError iae) {
			assertThat(iae.getMessage(), is("Can't dequeue() an empty queue"));
			}
		}
		@Test
		public void dequeueOne() {
			MyIntegerQueue queue = new MyIntegerQueue();
			LinkedList<Integer> data = queue.getData();
			data.add(42);

			Integer dequeued = queue.dequeue();
			assertThat(data.size(), is(0));
			assertThat(dequeued, is(42));
		}

		@Test
		public void isEmptyTrue() {
			MyIntegerQueue queue = new MyIntegerQueue();
			assertTrue(queue.isEmpty());
		}

		@Test
		public void isEmptyFalse() {
			MyIntegerQueue queue = new MyIntegerQueue();
			queue.enqueue(42);
			assertFalse(queue.isEmpty());
		}
	}
