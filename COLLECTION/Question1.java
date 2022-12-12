package COLLECTION;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question1 {
	public static void main(String args[]) {
		List<Integer> listOfElements = Arrays.asList(6, 78, 9, 1, 2, 4, 32, 34, 12, 1);
		System.out.println("unsorted Elements list : " + listOfElements);
		Collections.sort(listOfElements);
		System.out.println("Sorted Elements list: " + listOfElements);
	}
}
