package claudia.mar06;

import static org.junit.Assert.*;

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

}}