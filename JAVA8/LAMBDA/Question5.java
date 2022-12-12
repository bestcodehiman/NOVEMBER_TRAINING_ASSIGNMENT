package JAVA8.LAMBDA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import JAVA8.LAMBDA.Question4.StringOperations;

public class Question5 {
	interface RangeFormat {
		public StringBuilder func(Integer arr[]);
	}

	public static void main(String args[]) throws IOException {
		Integer arr[] = { 1, 2, 3, 4, 6, 7, 8, 11, 13, 14, 15, 19, 20, 21 };

		RangeFormat check = (a) -> {
			StringBuilder str = new StringBuilder();
			Integer currentValue = arr[0];
			Integer previousValue = arr[0];
			for (int i = 1; i < a.length; i++) {
				if (a[i] == currentValue + 1) {
					currentValue = a[i];
				} else {
					if (currentValue == previousValue) {
						str.append(currentValue + ",");
					} else {
						str.append(previousValue + "-" + currentValue + ",");
					}
					previousValue = a[i];
					currentValue = a[i];
				}
			}
			return str;
		};
		System.out.println("Final output is : " + check.func(arr));
	}

}
