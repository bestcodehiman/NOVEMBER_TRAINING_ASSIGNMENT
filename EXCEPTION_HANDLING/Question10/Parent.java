package EXCEPTION_HANDLING.Question10;

public class Parent {
	public void calculateMax(Integer s[], Integer length) throws NumberFormatException, NullPointerException, ArrayIndexOutOfBoundsException {
		Integer max = s[0];
		for (int i = 1; i < length; i++) {
			if (s[i] > max) {
				max = s[i];
			}
		}
		System.out.println("Max value : " + max);
	};
}
