package JAVA8.LAMBDA;

import java.util.Arrays;

public class Question9 {
	static int partition(int array[], int low, int high) {
		int pivot = array[high];

		int i = (low - 1);

		for (int j = low; j < high; j++) {
			if (array[j] <= pivot) {

				i++;

				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}

		}

		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;

		return (i + 1);
	}

	static void quickSort(int array[], int low, int high) {
		if (low < high) {
			int pi = partition(array, low, high);

			quickSort(array, low, pi - 1);

			quickSort(array, pi + 1, high);
		}
	}

	public static void main(String args[]) {

		int[] data = { 9, 7, 5, 43, 23, 32, 21, 1, 7 };
		System.out.println("Unsorted Array : ");
		System.out.println(Arrays.toString(data));

		int size = data.length;

		quickSort(data, 0, size - 1);

		System.out.println("Sorted Array : ");
		System.out.println(Arrays.toString(data));
	}
}
