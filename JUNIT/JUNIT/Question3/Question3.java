package JUNIT.Question3;

public class Question3 {
	public Integer findEvenDigits(Integer n) {
		Integer counter = 0;
		String value = String.valueOf(n);
		for (char digit : value.toCharArray()) {
			if (Integer.parseInt(String.valueOf(digit)) % 2 == 0) {
				counter += 1;
			}
		}
		return counter;
	}

	public Integer findOddDigits(Integer n) {
		Integer counter = 0;
		String value = String.valueOf(n);
		for (char digit : value.toCharArray()) {
			if (Integer.parseInt(String.valueOf(digit)) % 2 == 1) {
				counter += 1;
			}
		}
		return counter;
	}
}
