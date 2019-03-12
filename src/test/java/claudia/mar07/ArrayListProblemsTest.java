package claudia.mar07;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.core.Is.*;
import java.util.ArrayList;

public class ArrayListProblemsTest {

	@Test
	public void removeDuplicates() {
		String[] raw = { "aa", "bb", "aa" };

		ArrayList<String> data = new ArrayList<String>();

		for (int i = 0; i < raw.length; i++) {
			data.add(raw[i]);
		}
		ArrayListProblems.removeDuplicates(data);
		assertThat(data.size(), is(2));
		assertThat(data.get(0), is(raw[0]));
		assertThat(data.get(1), is(raw[1]));

	}

}
