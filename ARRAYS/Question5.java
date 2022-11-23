package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Question5 {
	public static Integer primeNoCounter = null;
	public static Integer perfectNoCounter = null;
	public static Integer primeNoList[] = null;
	public static Integer perfectNoList[] = null;
	public static Integer evenNoList[] = null;
	public static Integer oddNoList[] = null;
	public static Integer evenNoCounter = null;
	public static Integer oddNoCounter = null;

	private static void isPrimeOrPerfect(Integer n) {
		Boolean isPrime = Boolean.TRUE;
		Integer total = 1;

		if (n == 1 || n == 0) {
			isPrime = Boolean.FALSE;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				isPrime = Boolean.FALSE;
				total += i;
			}
		}
		if (isPrime.equals(Boolean.TRUE)) {
			primeNoList[primeNoCounter] = n;
			primeNoCounter += 1;
		}
		if (total == n) {
			perfectNoList[perfectNoCounter] = n;
			perfectNoCounter += 1;
		}
	}

	public static void main(String[] args) {

		Integer arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Integer n = arr.length;
		primeNoList = new Integer[n];
		perfectNoList = new Integer[n];
		evenNoList = new Integer[n];
		oddNoList = new Integer[n];

		primeNoCounter = 0;
		perfectNoCounter = 0;
		evenNoCounter = 0;
		oddNoCounter = 0;

		for (Integer i = 0; i < arr.length; i++) {
			isPrimeOrPerfect(arr[i]);
			if (arr[i] % 2 == 0) {
				evenNoList[evenNoCounter] = arr[i];
				evenNoCounter += 1;
			} else if (arr[i] % 2 == 1) {
				oddNoList[oddNoCounter] = arr[i];
				oddNoCounter += 1;
			}
		}
		printTheArr(primeNoList, "Prime");
		printTheArr(perfectNoList, "Perfect");
		printTheArr(evenNoList, "Even");
		printTheArr(oddNoList, "Odd");
	}

	private static void printTheArr(Integer arr[], String type) {
		System.out.print("List of " + type + " no is : ");
		for (Integer i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				break;
			}
			System.out.print(arr[i] + ", ");
		}
		System.out.println("");
	}

}
