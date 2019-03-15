package claudia.mar15;

import static org.junit.Assert.*;

import static org.hamcrest.core.Is.*;
import org.junit.Test;

public class HackerrankExTest {

	@Test
	public void ifElseOdd() {
		String result = HackerrankEx.ifElse(1);
		assertThat(result, is("Weird"));
	}
	@Test
	public void ifElse2() {
		String result = HackerrankEx.ifElse(2);
		assertThat(result, is("Not Weird"));
	}
	@Test
	public void ifElse8() {
		String result = HackerrankEx.ifElse(8);
		assertThat(result, is("Weird"));
	}
	@Test
	public void ifElse21() {
		String result = HackerrankEx.ifElse(21);
		assertThat(result, is("Not Weird"));
	}
}
