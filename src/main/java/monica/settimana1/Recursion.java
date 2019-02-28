package monica.settimana1;

public class Recursion {
	public static int recursivefactorial(int n) {
		if (n == 1) {
			return 1;

		}
		return recursivefactorial(n - 1) * n;
	}

	static public int factorial(int n) {
		int result = n;

		for (int i = 1; i < n; i++) {
			result *= i;
		}
		return result;

	}

	public static void main(String[] args) {
		System.out.println(recursivefactorial(5));
		System.out.println(factorial(6));
	}
}
