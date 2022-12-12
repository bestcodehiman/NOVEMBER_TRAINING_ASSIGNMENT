package EXCEPTION_HANDLING.Question10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question10 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		Integer arr[] = { 9, 6, 3, 2, 5, 7, 1, 9 };
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the array length : ");
		Integer length = Integer.parseInt(bf.readLine());
		Parent p = new Parent();
		try {
			p.calculateMax(arr, length);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		Parent c = new Child();
		try {
			c.calculateMax(arr, length);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

}
