package JUNIT.Question7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Question7Test {
	Question7 obj = new Question7();

	@Test
	public void testBinaryEquivalent() {
		assertEquals(1001, obj.binary(9));
	}
}
