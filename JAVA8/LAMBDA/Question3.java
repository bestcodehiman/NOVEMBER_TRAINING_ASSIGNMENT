package JAVA8.LAMBDA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import JAVA8.LAMBDA.Question1.PalindromeCheck;

public class Question3 {
	interface CheckNumber {
		Boolean func(Integer n, String value);
	}

	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the option number in format {option number} : ");
		String originalStr = bf.readLine();
		String[] arr = originalStr.split(" ");
		CheckNumber check = (n, value) -> {
			if (n == 1) {
				System.out.println("Checking no is even or not :");
				if (Integer.parseInt(value) % 2 == 0) {
					return Boolean.TRUE;
				}
				return Boolean.FALSE;
			} else if (n == 2) {
				System.out.println("Checking no is odd or not :");
				if (Integer.parseInt(value) % 2 == 1) {
					return Boolean.TRUE;
				}
				return Boolean.FALSE;
			} else if (n == 3) {
				System.out.println("Checking no is armstrong or not :");
				Integer finalValue = 0;
				Integer currentInteger;
				for (int i = 0; i < value.length(); i++) {
					currentInteger = Integer.valueOf(String.valueOf(value.charAt(i)));
					finalValue += (currentInteger * currentInteger * currentInteger);
				}
				if (finalValue == Integer.parseInt(value)) {
					return Boolean.TRUE;
				}
				return Boolean.FALSE;
			} else if (n == 4) {
				System.out.println("Checking no is palindrome :");
				for (int i = 0, j = value.length() - 1; i < j; i++, j--) {
					if (!String.valueOf(value.charAt(i)).equals(String.valueOf(value.charAt(j)))) {
						return Boolean.FALSE;
					}

				}
				return Boolean.TRUE;
			}
			return Boolean.FALSE;

		};
		if(check.func(Integer.parseInt(arr[0]), arr[1])) {
		System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
