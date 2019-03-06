package donatella.mar06;

public class SimpleMethods {

//	input: char c
//	output: true if is an uppercase character('A')
//	    false otherwise('h')
//	'6'
	
	public static boolean IsUpper(char c) {
		if(c >='A' && c <= 'Z')	{
			return true;
	} return false;
	
} 

//	input: char c
//	output: true if c is an alphabetic character ('A','c')

	public static boolean isAlpha(char c) {
	if((c >='A'&& c <='Z')|| (c >='a'&& c <='z')) {
    return true; }
 	return false;


}
// input: char c
//	output: char converted to uppercase
//	'x'--> 'X'
	
	
	public static char toUpper(char c) {
		if(c<'a' || c>'z') {
			return c;
					}
		
		return(char) (c +'A'-'a');
		
		}
		
		
//		input: int[]data;
//	    otput:smallest element
	
//	{1,2,5,-7} -> -7
//	{MAX_VALUE, MAX_VALUE, MAX_VALUE} -> MAX_VALUE
	
	public static int smallest(int[]data) {
		int currentMinumun= Integer.MAX_VALUE;
		if(data==null || data.length==0) {
		return Integer.MAX_VALUE;
				}
		for(int i=0; i< data.length;i++) {
			if(data [i] < currentMinumun) {
				currentMinumun=data[i];
			}
		}
	
	
return currentMinumun;
	}

//	imput: int[]data
//  output:smallest element
//  {1,2,5,-7}->3
//  null,{}->-1

                   public static int firstSmallestIndex(int[]data) {
                	   if(data==null||data.length ==0){
                       return -1;
                	   }  
                	   int pos =0;
                 
                	for(int i = 1; i < data.length; i++) {
					if(data [i] < data[pos]) {
                	          pos= i ;
	               

                	   }
                	}  
					return pos;            	  
                	   
                   }    	

				public static int lastSmallestIndex(int[] data) {
					  if(data==null||data.length ==0){
	                       return -1;
	                	   }  
	                	   int pos =0;
	                 
	                	for(int i = 1; i < data.length; i++) {
						if(data [i] <= data[pos]) {
	                	          pos= i ;
					
					
				}
                   
	                	}
						return pos;}


// {1,2,3} 2-> true
// {1,2,3}, 7 -> false

	public static boolean find(int[] data, int target) {
		for (int i = 0; i < data.length; i++) {
			if (target == data[i]) {
				return true;
			}
		}

		return false;
	}

//	{1,2,3}, 2 -> 1
//	{1,2,3},7 ->-1
			
			
			

				public static int findPost(int[] data, int target) {
					   int index=0;
						for (int i = 0; i < data.length; i++) {
						if(target==data[i]) {
						return data [index];
					}
						}
						return -1;
					
				}

				public static Object findPost(int[] data) {
					// TODO Auto-generated method stub
					return null;
				}

}
				


