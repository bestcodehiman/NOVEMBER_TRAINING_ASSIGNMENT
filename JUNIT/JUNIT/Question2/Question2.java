package JUNIT.Question2;

public class Question2 {
	public Integer factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}
