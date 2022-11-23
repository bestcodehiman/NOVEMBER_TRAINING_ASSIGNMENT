package array;

public class Question6 {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 6, 10, 7, 4, 2, 1 , 9};
		int n = arr.length;
		int[] sorted = new int[n];
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		int counter = 0;
		for (int i = 0; i < (int) Math.floor(n/2); i++) {
			sorted[i] = arr[i];
			counter += 1 ;
			System.out.print(arr[i] + " ");
		}
		for (int i = n-1; i > ((int) Math.ceil(n/2) - 1); i--) {
			sorted[i] = arr[i];
			counter +=1 ;
			System.out.print(arr[i] + " ");
		}
	}

}
