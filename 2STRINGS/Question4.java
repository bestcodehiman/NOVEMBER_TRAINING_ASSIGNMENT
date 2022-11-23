package string_questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Question4 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char currentChar;
		List<Character> duplicateList = new ArrayList<Character>();
		List<Character> uniqueList = new ArrayList<Character>();
		for (int i = 0; i < str.length(); i++) {
			currentChar = str.charAt(i);
			if (uniqueList.contains(currentChar) && !duplicateList.contains(currentChar)) {
				duplicateList.add(currentChar);
			} else {
				uniqueList.add(currentChar);
			}
		}
		System.out.println(duplicateList);
	}
}
