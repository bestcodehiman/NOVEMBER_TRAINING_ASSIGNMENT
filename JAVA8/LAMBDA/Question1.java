package JAVA8.LAMBDA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question1 {
	interface PalindromeCheck {
		Boolean func(String n);
	}

	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string to be checked for palindrome : ");
		String originalStr = bf.readLine();
		PalindromeCheck check = (str) -> {
			for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
				if (!String.valueOf(str.charAt(i)).equals(String.valueOf(str.charAt(j)))) {
					return Boolean.FALSE;
				}

			}
			return Boolean.TRUE;
		};
		if (check.func(originalStr)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("Not a palindrome String");
		}
	}
}
