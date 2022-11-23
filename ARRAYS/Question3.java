package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

public class Question3 {
	public static Integer[] dynamicArray = null;
	public static Integer[] temp = null;

	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		while (true) {

			str = br.readLine();
			if (Objects.isNull(str) || str.equals("")) {
				break;
			}
			try {
				add(Integer.parseInt(str));
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(0);
			}
		}

		for (Integer i : dynamicArray) {
			System.out.print(i);
		}

	}

	private static void add(Integer value) {
		if (Objects.isNull(dynamicArray)) {
			dynamicArray = new Integer[1];
			dynamicArray[0] = value;
		} else {
			temp = new Integer[dynamicArray.length + 1];
			for (Integer i = 0; i < dynamicArray.length; i++) {
				temp[i] = dynamicArray[i];
			}
			temp[dynamicArray.length] = value;
			dynamicArray = temp.clone();

		}

	}
}
