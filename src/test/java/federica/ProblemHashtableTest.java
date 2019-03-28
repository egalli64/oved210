package federica;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.hamcrest.Matcher;
import org.junit.Test;

public class ProblemHashtableTest {

	@Test
	public void testFindUnique2() {
	int [] data = new int [] {2,1,1};
	assertThat(ProblemHashtable.findUnique(data), is(2));
	}

	@Test
	public void testFindUniqueHash() {
	int [] data = new int [] {2,1,1};
	HashSet<Integer> fuh = new HashSet<>();
	assertThat(ProblemHashtable.findUniqueHash(data), is(2));
	}

	@Test
	public void testHasEven() {
	
	}

	@Test
	public void testIsEven() {
	;
	}

}
