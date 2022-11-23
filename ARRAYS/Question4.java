package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question4 {
	private static Integer arr[] = null;
	private static Integer doubleArr[] = null;
	private static Integer pythagoras[] = null;
	private static Integer counter = null;

	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer n = Integer.parseInt(br.readLine());
		arr = new Integer[n];
		doubleArr = new Integer[n];
		pythagoras = new Integer[n];
		counter = 0;
		for (Integer i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			doubleArr[i] = arr[i] * arr[i];
		}
		for (Integer val1 : arr) {
			for (Integer val2 : arr) {
				checkCondition(val1, val2);
			}
		}
	}

	private static void checkCondition(Integer val1, Integer val2) {
		Integer val = (val1 * val1) + (val2 * val2);
		for (Integer i = 0; i < arr.length; i++) {
			if (doubleArr[i] == val && processed(arr[i])) {
				System.out.println(val1 + "*" + val1 + " + " + val2 + "*" + val2 + " = " + arr[i] + "*" + arr[i]);
				pythagoras[counter] = arr[i];
				return;
			}
		}
	}

	private static Boolean processed(Integer processed) {
		for (int i = 0; i < arr.length; i++) {
			if (pythagoras[i] == null) {
				return Boolean.TRUE;
			} else if (processed == pythagoras[i]) {
				return Boolean.FALSE;
			}
		}
		return Boolean.TRUE;
	}
}
