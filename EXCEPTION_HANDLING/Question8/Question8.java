package EXCEPTION_HANDLING.Question8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question8 {
	public static void main(String[] args) throws IOException, PasswordFormatException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the password");
		String password = bf.readLine();
		isPasswordValid(password);
		System.out.println("Entered password is valid");

	}

	private static void isPasswordValid(String password) throws PasswordFormatException {
		int digits = 0;
		int capital = 0;
		int small = 0;
		int special = 0;
		if (password.length() < 8 && password.length() > 14) {
			throw new PasswordFormatException();
		}

		for (Character ch : password.toCharArray()) {
			String word = String.valueOf(ch);
			if (word.matches("(?=.*[0-9]).*")) {
				digits += 1;
			} else if (word.matches("(?=.*[a-z]).*")) {
				small += 1;
			} else if (word.matches("(?=.*[A-Z]).*")) {
				capital += 1;
			} else if (word.matches("(?=.*[~!@#$%^&*()_-]).*")) {
				special += 1;
			}
		}
		if (digits < 2 || small < 2 || capital < 2 || special < 2) {
			throw new PasswordFormatException();
		}
	}

}
