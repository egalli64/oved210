package alessandraC.mar13;

import static org.junit.Assert.*;

import org.hamcrest.core.*;

import org.junit.Test;

public class ProblemTest {

	@Test
	public void Count() {
		int[] data = {1, 2, 3, 4}; 
		assertThat(data, is(4));
				
	}

	
	}


