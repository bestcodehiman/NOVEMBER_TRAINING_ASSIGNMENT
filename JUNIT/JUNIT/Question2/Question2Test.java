package JUNIT.Question2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Question2Test {
	Question2 obj = new Question2();

	@Test
	public void testFactorial() {
		assertEquals(120, obj.factorial(5));
	}
}
