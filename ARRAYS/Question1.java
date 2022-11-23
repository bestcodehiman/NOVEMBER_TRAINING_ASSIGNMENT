package array;

public class Question1 {
	public static void main(String[] args) throws java.lang.Exception {
		Integer[] a = { 7, 6, 3, 9, 9, 8, 2, 8, 8, 7, 7, 3, 1 };
		Integer sortedArr[] = { null, null, null };
		Integer max;
		for (Integer i = 0; i < sortedArr.length; i++) {
			max = a[0];
			for (Integer j = 0; j < a.length; j++) {
				if (contains(sortedArr, max) && !contains(sortedArr, a[j])) {
					max = a[j];
				}
				if (a[j] > max && !contains(sortedArr, a[j])) {

					max = a[j];
				}
			}
			sortedArr[i] = max;
		}
		System.out.println(sortedArr[2]);

	}

	public static Boolean contains(Integer arr[], Integer element) {
		for (Integer i : arr) {
			if (element == i) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;

	}
}
