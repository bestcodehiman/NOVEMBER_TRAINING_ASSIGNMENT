package array;

import java.util.Objects;

public class Question2 {

	public static Integer[] duplicate;
	public static Integer[] frequency;

	public static void main(String[] args) throws java.lang.Exception {
		Integer[] arr = { 7, 6, 3, 9, 9, 8, 2, 8, 8, 7, 7, 3, 1 };
		duplicate = new Integer[13];
		frequency = new Integer[13];
		for (Integer i = 0; i < arr.length; i++) {
			findFrequency(arr[i], 13);
		}

		for (Integer j = 0; j < 13; j++) {
			if (Objects.isNull(duplicate[j])) {
				break;
			} else if (frequency[j] > 1) {
				System.out.println("frequency of no " + duplicate[j] + " is " + frequency[j]);
			}
		}

	}

	private static void findFrequency(Integer value, Integer length) {
		for (Integer i = 0; i < length; i++) {
			if (Objects.isNull(duplicate[i])) {
				duplicate[i] = value;
				frequency[i] = 1;
				return;
			} else if (duplicate[i] == value) {
				frequency[i] += 1;
				return;
			}
		}
	}

}
