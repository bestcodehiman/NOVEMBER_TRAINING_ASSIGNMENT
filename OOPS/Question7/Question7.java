package OOPS.Question7;

import java.util.Scanner;

public class Question7  extends Parent{
	public Question7() {
		super();
	}
	
	@Override
	public void compareTo(String input1, String input2) {
		if(input1.length() == input2.length()) {
			char[] arr1 = new char[input1.length()];
			char[] arr2 = new char[input2.length()];
			
			for (int i = 0; i < input1.length(); i++) {
				if(arr1[i]!=arr2[i]) {
					System.out.println("String Not Matched");
					break;
				}
				else {
					System.out.println(arr1[i]+ "Matched to "+arr2[i]);
				}
			}
			
		}else {
			System.out.println("String Not Matched");
		}
		
		
		if(input1.equalsIgnoreCase(input2)) {
			System.out.println("String Matched");
		}
		else {
			System.out.println("String Not Matched");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter First String");

		Scanner scan = new Scanner(System.in);
		String input1 = scan.next();
		
		System.out.println("Enter Second String");
		String input2 = scan.next();
		
		Parent c = new Question7();
		c.compareTo(input1,input2);
		
	}
}
