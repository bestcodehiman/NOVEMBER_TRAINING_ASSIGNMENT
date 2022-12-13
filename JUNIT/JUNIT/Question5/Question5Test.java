package JUNIT.Question5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Question5Test {
	Question5 obj = new Question5();

	@Test
	public void testExpressionResult() {
		assertEquals(6, obj.findExpressionResult("8*3/4"));
	}
}
