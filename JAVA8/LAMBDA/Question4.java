package JAVA8.LAMBDA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question4 {
	interface StringOperations {
		public StringBuilder func(String s1, String s2, Integer index);
	}
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first string : ");
		String s1 = br.readLine();
		System.out.println("Enter second string : ");
		String s2 = br.readLine();
		System.out.println("Enter index at which second string need to be inserted : ");
		Integer index = Integer.parseInt(br.readLine());
		
		StringOperations check = (str1, str2, ind) -> {
			StringBuilder s = new StringBuilder("");
			for (int i=0; i<str1.length(); i++) {
				if (i==index) {
					s.append(str2);
				}
				s.append(String.valueOf(str1.charAt(i)));
			}
			return s;
		};
		System.out.println("Final string is : " + check.func(s1, s2, index));
		check = null;
		System.gc();
		System.out.println("Garbage collection called");
	}

}
