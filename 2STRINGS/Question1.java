package string_questions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question1 {
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		Integer index = Integer.parseInt(br.readLine());
		StringBuilder str3 = new StringBuilder("");
		if(index >= str1.length()) {
		    System.out.println("Provided index is bigger than array size");
		}
		for (Integer i=0; i<str1.length(); i++) {
		    if(i==index) {
		        str3.append(str2);
		    }
		    str3.append(str1.charAt(i));
		}
		System.out.println(str3);
	}
}
