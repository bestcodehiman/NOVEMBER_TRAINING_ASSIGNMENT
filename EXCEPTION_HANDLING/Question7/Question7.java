package EXCEPTION_HANDLING.Question7;

import java.io.IOException;

public class Question7 {
	public static void divide(int a, int b) {
		if (b == 0) {
			ArithmeticException ae = new ArithmeticException("top layer");
			ae.initCause(new IOException("acutual cause"));
			throw ae;
		} else {
			System.out.println(a / b);
		}
	}

	public static void main(String[] args) {
		try {
			divide(5, 0);
		} catch (ArithmeticException ae) {
			System.out.println("caught : " + ae);
			System.out.println("actual exception cause: " + ae.getCause());
		}
	}
}
