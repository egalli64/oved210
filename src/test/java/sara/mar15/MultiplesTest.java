package sara.mar15;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import org.hamcrest.Matcher;
import org.junit.Test;

public class MultiplesTest {

	@Test
	public void multiples() {
		int [] result = Multiples.multiples(2);
		assertThat(result[0], is(2));
		assertThat(result[1], is(4));
		assertThat(result[2], is(6));
		assertThat(result[3], is(8));
		assertThat(result[4], is(10));
		assertThat(result[5], is(12));
		assertThat(result[6], is(14));
		assertThat(result[7], is(16));
		assertThat(result[8], is(18));
		assertThat(result[9], is(20));
	}
	
	

}
