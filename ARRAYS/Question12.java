package array;

import java.io.IOException;

public class Question12 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Integer[] arr = {10,2,3,41,12,13,19,81,9};
		Integer[] arrWithTens = new Integer[arr.length];
		String str;
		String value;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for (int i=0; i<arr.length; i++) {
			str = String.valueOf(arr[i]);
			value = ""+str.charAt(str.length()-1);
			arrWithTens[i] = Integer.parseInt(value);
		}
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmpLength = 0;
				Integer temp = null;
				if (arrWithTens[i] > arrWithTens[j]) {
					tmpLength = arrWithTens[i];
					temp = arr[i];
					arr[i] = arr[j];
					arrWithTens[i] = arrWithTens[j];
					arrWithTens[j] = tmpLength;
					arr[j] = temp;
				}
			}
		}
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
