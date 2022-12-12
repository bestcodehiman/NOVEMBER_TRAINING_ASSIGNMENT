package COLLECTION;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Question3 {
	public static void main(String args[]) {

		List<Integer> list = Arrays.asList(6, 78, 9, 1, 2, 4, 9, 9, 6, 32, 34, 12, 1);
		System.out.println("Actual List :" + list);
		list = list.stream().collect(Collectors.toSet()).stream().collect(Collectors.toList());
		Collections.sort(list);
		System.out.println("Unique sorted elements List : " + list);
	}

}
