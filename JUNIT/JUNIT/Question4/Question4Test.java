package JUNIT.Question4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Question4Test {
	Question4 obj = new Question4();

	@Test
	public void testFindEvenDigits() {
		assertEquals(9, obj.findExpressionSum("2+3+4"));
	}
}
