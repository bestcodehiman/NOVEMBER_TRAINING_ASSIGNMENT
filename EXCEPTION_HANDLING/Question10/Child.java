package EXCEPTION_HANDLING.Question10;

public class Child extends Parent {

	@Override
	public void calculateMax(Integer[] s, Integer length) throws NumberFormatException, NullPointerException {
		Integer max = s[0];
		Long total = (long) s[0];
		for (int i = 1; i < length; i++) {
			total += s[i];
			if (s[i] > max) {
				max = s[i];
			}
		}
		System.out.println("Avg value : " + (total / length));
		System.out.println("Max value : " + max);
	}

}
