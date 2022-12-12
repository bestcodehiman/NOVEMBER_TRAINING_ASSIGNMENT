package COLLECTION;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question4 {
	public static void main(String args[]) {
		List<String> list = Arrays.asList("hello","is", "you", "abhi", "how", "is", "you", "family", "members");
		System.out.println("Actual items List :" + list);
		list = list.stream().collect(Collectors.toSet()).stream().collect(Collectors.toList());
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println("Sorted unique items List : " + list);
	}

}
