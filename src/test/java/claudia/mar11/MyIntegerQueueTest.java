package claudia.mar11;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
public class MyIntegerQueueTest {

	@Test
	public void enqueueOne() {
		MyIntegerQueue queue = new MyIntegerQueue();
		queue.enqueue(42);
		
		LinkedList<Integer> data = queue.getData();
		assertThat(data.size(), is(1));
		assertThat(data.get(0), is (42));
	}

}
