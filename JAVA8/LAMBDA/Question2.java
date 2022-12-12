package JAVA8.LAMBDA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question2 {
	interface StringCheck {
		Boolean func(String n);
	}

	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string : ");
		String originalStr = bf.readLine();
		StringCheck check = (str) -> {
			if (str.contains("ast") || str.contains("sta") || str.contains("tas") || str.contains("tsa")) {
				return Boolean.TRUE;
			}
			;
			return Boolean.FALSE;
		};

		if (check.func(originalStr)) {
			System.out.println("String found");
		} else {
			System.out.println("String not found.");
		}

	}
}
