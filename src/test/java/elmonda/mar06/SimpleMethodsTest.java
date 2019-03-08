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
@Test
public void findPosPositive() {
	int[] data = {1, 2, 3};
	int target = 2;
	assertEquals(1,SimpleMethods.findPos(data, target));
}
//@Test
//public void findPosNegative() {
//	int[] data = {1, 2, 3};
//	int target = 7;
//	assertEquals(-1, SimpleMethods.findPos(data, target));
//}
@Test
public void isPalindromeOddNegative() {	
	assertFalse(SimpleMethods.isPalindrome("aab"));

//}
//@Test
//public void isPalindromeOddPositive() {	
//	assertTrue(SimpleMethods.isPalindrome("aba"));
}
//@Test
//public void isPalindromeEvenPositive() {	
//	assertTrue(SimpleMethods.isPalindrome("abab"));
//}
@Test
public void isPalindromeNull() {	
	assertFalse(SimpleMethods.isPalindrome(null));

}
@Test
public void isPalindromeEmpty() {	
	assertTrue(SimpleMethods.isPalindrome(""));
}
@Test
public void reverseSimple() {
	int[] data = {1, 2, 3,};
	SimpleMethods.reverse(data);  // sto chiamando il mio metodo reverse, sto passando un array 1, 2, 3 e mi aspetto che ritorni 3,2,1
	  
assertThat(data.length, is(3));
assertThat(data[0], is(3));
assertThat(data[1], is(2));
assertThat(data[2], is(1));	
//for(int i=0; i < data.length; i++) {
//	assertThat(reverted[i], is(data[data.length - 1 - i]));

}
@Test
public void reverseReturnNull() {
	int[] data = null;
	SimpleMethods.reverseReturn(data);
	assertNull(data);
	
}

@Test
public void reverseReturnEmpty() {
	int[] data = {};
	SimpleMethods.reverseReturn(data);
	assertThat(data.length, is(0));
	
}
@Test
public void reverseReturnPlain() {
	int[] data = {1, 2, 3, 4, 5};
	SimpleMethods.reverse(data);
	//int[] reverted = SimpleMethods.reverseReturn(data);
	
//	assertThat(reverted.length, is (data.length));
	//for(int i = 0; i < reverted.length; i++) {
		//assertThat(reverted[i], is(data[data.length -1-i]));
		
		assertThat(data.length, is(5));
		assertThat(data[0], is(5));
		assertThat(data[1], is(4));
		assertThat(data[2], is(3));
		assertThat(data[3], is(2));
		assertThat(data[4], is(1));
		
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