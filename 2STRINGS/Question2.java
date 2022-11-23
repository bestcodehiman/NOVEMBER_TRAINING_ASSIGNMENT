package string_questions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question2 {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		Integer[] smallCount = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		Integer[] capitalCount = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		for (int i=0; i<str1.length(); i++) {
			Integer value = (int) str1.charAt(i);
			if(value>=65 && value<=90) {
				capitalCount[value-65] += 1;  
			} else if(value>=97 && value<=122) {
				smallCount[value-97] += 1;
			}
		}
		System.out.print("Asc order : ");
		for(Integer counter=0; counter<smallCount.length; counter++) {
			printChar(capitalCount[counter], (char)(65+counter));
			printChar(smallCount[counter], (char)(97+counter));
		}
		System.out.print(", Desc order : ");
		for(Integer counter = smallCount.length-1; counter>=0; counter--) {
			printChar(capitalCount[counter], (char)(65+counter));
			printChar(smallCount[counter], (char)(97+counter));
		}

	}
	
	public static void printChar(int frequency, char ch) {
		for(int i=0; i<frequency; i++) {
			System.out.print(ch);
		}
	}

}
