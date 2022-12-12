package COLLECTION;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Question2 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		List<Integer> list = Arrays.asList(6, 78, 9, 1, 2, 4, 32, 34, 12, 1);
		// Sorting the elements
		Collections.sort(list);
		System.out.println("List of elements are : " + list);
		// List to array conversion
		int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the element to be searched : ");
		int searchedElement = Integer.parseInt(bf.readLine());
		Integer ind = Collections.binarySearch(list, searchedElement);

		if (Objects.isNull(ind) || ind < 0) {
			System.out.println("Using collection binary search element not found");
		} else {
			System.out.println("Binary search using collections API, element found at index : " + ind);
		}
		int first = 0;
		int last = arr.length - 1;
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] < searchedElement) {
				first = mid + 1;
			} else if (arr[mid] == searchedElement) {
				System.out.println("Element found at index: " + mid);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Element not found!");
		}

	}
}
