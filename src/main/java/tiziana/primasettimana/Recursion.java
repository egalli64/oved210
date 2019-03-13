package tiziana.primasettimana;

public class Recursion {
	static public int recursiveFactorial(int n) {
        if(n==1) {
        	return 1;  
    }
        return recursiveFactorial(n-1)*n;     
	}
	
	
	static public int factorial(int n) {
		int result=n;
		for(int i=2; i<n; i++) {
			result*=i;
			
		}
		
	 	return result;
	}
			

	
	
	
	public static void main(String[] args) {
		System.out.println(recursiveFactorial(5));
		System.out.println(factorial(5));
	}
    }


        


