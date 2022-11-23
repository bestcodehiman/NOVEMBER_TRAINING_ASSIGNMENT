package array;

import java.io.IOException;

public class Question10 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		String[] arr = {"nan", "sefrgg", "rstsr", "frrf", "newstr"};
		Integer[] arrWithLen = new Integer[arr.length];
		for (int i=0; i<arr.length; i++) {
			arrWithLen[i] = arr[i].length();
		}
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmpLength = 0;
				String temp = null;
				if (arrWithLen[i] > arrWithLen[j]) {
					tmpLength = arrWithLen[i];
					temp = arr[i];
					arr[i] = arr[j];
					arrWithLen[i] = arrWithLen[j];
					arrWithLen[j] = tmpLength;
					arr[j] = temp;
				}
			}
		}
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
