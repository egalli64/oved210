package claudia.mar07;

public class Palindrome {
	public static boolean isPalindrome(String s) {
		if (s == null) {
			return false;
		}

		if (s.length() < 2) {
			return true;
		}
		int left = 0;
		int right = s.length() - 1;
//		for (int i = 0; i < s.length(); i++)
//			System.out.println(s.charAt(i));

		for (; left < right; left++, right--) {
			if (s.charAt(left) == s.charAt(right)) {
				return true;
			}}

		if (s.charAt(right) != s.charAt(left)) {
			return false;
		}

		return false;
	}

}
