package string_questions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question3 {

	public static final char[] VOWELS = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char currentChar;
		StringBuilder finalStr = new StringBuilder("");
		for (int i = 0; i < str.length(); i++) {
			currentChar = str.charAt(i);
			finalStr = isVowel(currentChar) ? finalStr : finalStr.append(currentChar);
		}
		System.out.println(finalStr);
	}

	private static Boolean isVowel(char ch) {
		for (char vowel : VOWELS) {
			if (vowel == ch) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}
}
