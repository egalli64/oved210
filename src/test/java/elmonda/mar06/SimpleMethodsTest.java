package elmonda.mar06;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.core.Is.*;
import org.junit.Test;

public class SimpleMethodsTest {

	@Test
	public void isUpperA() {
		assertTrue(SimpleMethods.isUpper('A'));
		
	}
	@Test
	public void isUpperLowerH() {
		assertFalse(SimpleMethods.isUpper('h'));

}
	@Test
	public void isUpperNumber() {
		assertFalse(SimpleMethods.isUpper('6'));
	}
	
	@Test
	public void isAlphaA() {
		assertTrue(SimpleMethods.isAlpha('A'));  //vogliamo testare A maiuscolo
}
	@Test
	public void isAlphaLowerC() {
		assertTrue(SimpleMethods.isAlpha('c'));	
}
	@Test
	public void isAlphaNumber() {
		assertFalse(SimpleMethods.isAlpha('6'));
}

	//////////////////////////////////////////////////////////////////////
	

@Test
public void toUpperA() {
	assertThat(SimpleMethods.toUpper('A'),is('A'));
	
}
public void toUpperLowerX() {
	assertThat(SimpleMethods.toUpper('x'),is('X'));
	
}
public void toUpperNumber() {
	assertThat(SimpleMethods.toUpper('9'),is('9'));
////////////////////////////////////////////////////////////////////////////////////////	
}
@Test
public void smallestPlain() {
	int[] data = {1,2,5, -7};
	assertThat(SimpleMethods.smallest(data), is(-7));
}
@Test
public void smallestNull() {
	int[] data= null;
	assertThat(SimpleMethods.smallest(data), is(Integer.MAX_VALUE));
	
}
@Test
public void smallestEmpty() {
	int[] data= {};
	assertThat(SimpleMethods.smallest(data), is(Integer.MAX_VALUE));

}
///////////////////////////////////////////////////////////////////////// 

//// test first e last indice della posizione
@Test
public void firstsmallestIndexNull() {
	int[] data = null;
	assertThat(SimpleMethods.firstSmallestIndex(data), is(-1));
	
}
@Test
public void firstsmallestIndexPlain() {
	int[] data = {1,2,5, -7};
	assertThat(SimpleMethods.firstSmallestIndex(data), is(3));
}
@Test
public void firstSmallestIndexDouble() {
	int[] data = {-7,2,5,-7};
	assertThat(SimpleMethods.firstSmallestIndex(data), is(0));
}
@Test
public void findPositive() {
	int[] data = {1, 2, 3};
	int target = 2;
	assertTrue(SimpleMethods.find(data, target));
}

@Test
public void findNegative() {
	int[] data = {1, 2, 3};
	int target = 7;
	assertFalse(SimpleMethods.find(data, target));
}
public void findPosPositive() {
	int[] data = {1, 2, 3};
	int target = 2;
	assertEquals(1, SimpleMethods.find(data, target));
}
public void findPosNegative() {
	int[] data = {1, 2, 3};
	int target = 7;
	assertEquals(-1, SimpleMethods.find(data, target));
}
}
//@Test
//public void firstsmallestIndexNull() {
//	int[] data = null;
//	assertThat(SimpleMethods.firstsmallestIndex(data), is(-1));
//	
//}
//@Test
//public void firstsmallestPlain() {
//	int[] data = {1,2,5, -7};
//	assertThat(SimpleMethods.firstsmallestIndex(data), is(3));
//}
//@Test
//public void firstsmallestEmpty() {
//	int[] data = {};
//	assertThat(SimpleMethods.firstsmallestIndex(data), is(-1));
//}
//}