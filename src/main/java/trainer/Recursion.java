package trainer;

public class Recursion {
	public static int recursiveFactorial(int n) {
		if (n == 1) {
			return 1;
		}
		return recursiveFactorial(n - 1) * n;
	}

	public static int factorial(int n) {
		int result = 1;

		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(recursiveFactorial(5));
		System.out.println(factorial(5));
	}
}
