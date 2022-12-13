package JUNIT.Question6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Question6Test {
	Question6 obj = new Question6();

	@Test
	public void testSum() {
		assertEquals(2107, obj.findSum());
	}
}
