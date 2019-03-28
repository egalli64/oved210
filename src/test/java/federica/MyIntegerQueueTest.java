package federica;

import static org.hamcrest.core.Is;

import org.junit.Test;

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
	public void dequeueOne() {
		MyIntegerQueue queue = new MyIntegerQueue();
		LinkedList<Integer> data = queue.getData();
		data.add(42);
		
		Integer dequeued = queue.dequeue();
		assertThat(data.size(), is(0));
		assertThat(dequeued, is(42));
	}

	@Test
	public void dequeueEmpty() {
		MyIntegerQueue queue = new MyIntegerQueue();
	}

	@Test
	public void deQueueEmpty() {
		MyIntegerQueue queue = new MyIntegerQueue();
	}

}
