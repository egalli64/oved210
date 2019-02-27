package mariangela;

public class Recursion {
	static public int recursivefactorial(int n) {
		if (n == 1) {
			return 1;
		}

		return recursivefactorial(n - 1) * n;
	}

	 public static int factorial(int n) {
		int result = n;
		for (int i = 2; i < n; i++) {
			result *= i;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(recursivefactorial(5));
		System.out.println(factorial(5));
	}
}
