package francesca.mar11;

import static org.junit.Assert.*;

import static org.hamcrest.core.Is.*;
import org.junit.Test;

public class ArrayListProblemsTest {

	private int[] data;
	@Test
	public void missingValue() {
		int [] data = {1,3,5,7,9,8,6,2};
		int missing = ArrayListProblems.missingValue(data);
		assertThat(missing, is(4));
		//  assertEquals(4, missing);
		
	}
    public void missingValue2in3() {
    	int[] data = { 1, 3};
    	
    	
    }
    
    
    public void missingValueLinear4in9() {
    	int [] data = {1,3,5,7,9,8,6,2};
    	int missing = ArrayListProblems.missingValueLinear(data);
    	assertEquals(4, missing);
    }
}
