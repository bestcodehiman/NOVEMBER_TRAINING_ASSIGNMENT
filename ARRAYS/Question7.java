package array;

public class Question7 {

	public static void main(String[] args) {
		int[] arr = { 2, 7, 3, 9, 4 };
		int n = arr.length;
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
		int[] temp = arr.clone();
		Integer lcm = 1;
		Integer val = 0;
		for (int i = 0; i < arr.length; i++) {
			val = arr[i];
			lcm *= val;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] % val == 0) {
					arr[j] = (int) Math.floor(arr[j] / val);
				}
			}
		}
		System.out.println("LCM is : " + lcm);
		Integer hcf = 1;
		Boolean flag = Boolean.FALSE;
		for (int i = 0; i < temp.length; i++) {
			val = temp[i];
			flag = Boolean.FALSE;
			for (int j = 0; j < temp.length; j++) {
				if (temp[j] % val == 0 && temp[j] != val) {
					temp[j] = (int) Math.floor(temp[j] / val);
					flag = Boolean.TRUE;
				}
			}
			if (Boolean.FALSE.equals(flag)) {
				break;
			}
			hcf *= val;
		}
		System.out.println("HCF is : " + hcf);

	}

}
