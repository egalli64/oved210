package elmonda.mar12;

import static org.junit.Assert.*;

import java.util.HashMap;

import static org.hamcrest.core.Is.*;
import org.junit.Test;

public class PhonesTest {

	@Test
	public void getNumber() {
		Phones phones = new Phones();
		phones.getPhones().put("User", 42);

		assertThat(phones.getNumber("User"), is(42));
	}

	@Test
	public void getName() {
		Phones phones = new Phones();
		phones.getPhones().put("User", 42);

		assertThat(phones.getName(42), is("User"));
	}

	@Test
	public void put() {
		Phones phones = new Phones();
		phones.put("User", 42);

		HashMap<String, Integer> data = phones.getPhones();
		assertThat(data.get("User"), is(42));
	}
}
