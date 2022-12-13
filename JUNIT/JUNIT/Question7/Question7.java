package JUNIT.Question7;

public class Question7 {
	public Integer binary(int n) {
		if (n == 1) {
			return 1;
		}
		return binary(n / 2) * 10 + n % 2;
	}
}
